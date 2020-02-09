package academia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.matisse.MtDatabase;
import com.matisse.MtException;
import com.matisse.MtObjectIterator;
import com.matisse.MtPackageObjectFactory;

public class mainAcademia {
	
	static String hostname = "localhost";
	static String dbname = "DBVinDaph";
	static MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "academia"));
	

	// Crear objetos
	public static void crearObjetos() {
		try {
			// Abrir base de datos
			db.open();
			db.startTransaction();
			System.out.println("Conectando con la base de datos " + db.toString() + " de Matisse");

			// Crear 1º Profesor
			profesores p1 = new profesores(db);
			p1.setNombre("María José");
			p1.setApellidos("Martinez");
			p1.setTelefono(614249350);
			p1.setDni("36741579-M");

			// Crear 2º Profesor
			profesores p2 = new profesores(db);
			p2.setNombre("Jorge");
			p2.setApellidos("Rodriguez");
			p2.setTelefono(687451248);
			p2.setDni("35421578-J");

			// Crear 1º Asignatura
			asignaturas a1 = new asignaturas(db);
			a1.setNombre("Acceso a Datos");
			a1.setAula("A1");
			a1.setDuracion(3);
			a1.setHoraInicio(12);
			a1.setDiaSemana("Miércoles");

			// Crear 2º Asignatura
			asignaturas a2 = new asignaturas(db);
			a2.setNombre("Desarrollo de Interfaces");
			a2.setAula("A1");
			a2.setDuracion(2);
			a2.setHoraInicio(13);
			a2.setDiaSemana("Jueves");

			// Crear 3º Asignatura
			asignaturas a3 = new asignaturas(db);
			a3.setNombre("Programación Android");
			a3.setAula("B2");
			a3.setDuracion(4);
			a3.setHoraInicio(17);
			a3.setDiaSemana("Martes");

			// Crear 1º Curso
			cursos c1 = new cursos(db);
			c1.setNombre("Big Data");
			c1.setAula("A3");
			c1.setDuracion(1);
			c1.setHoraInicio(19);
			c1.setFecha("23/02/2020");

			// Crear 1º Curso
			cursos c2 = new cursos(db);
			c2.setNombre("BD Mongo");
			c2.setAula("B1");
			c2.setDuracion(2);
			c2.setHoraInicio(10);
			c2.setFecha("11/03/2020");

			// Crear 1º Clases
			clases cl1[] = new clases[2];
			cl1[0] = a1;
			cl1[1] = c2;

			// Crear 2º Clases
			clases cl2[] = new clases[3];
			cl2[0] = a2;
			cl2[1] = a3;
			cl2[2] = c1;

			// Asignar clases
			p1.setImparten(cl1);
			p2.setImparten(cl2);

			// Actualizar y cerrar base de datos
			db.commit();
			db.close();
			System.out.println("Creación realizada.");
		} catch (MtException mte) {
			System.out.println("MtException : " + mte.getMessage());
		}
	}

	public static void borrarObjetos() {

		try {

			// Abrir base de datos
			db.open();
			db.startTransaction();
			System.out.println("Conectando con la base de datos " + db.toString() + " de Matisse");

			// Mostrar cuantos cursos hay
			System.out.println(cursos.getInstanceNumber(db) + " cursos en la DB.");
			// Borra todos los cursos
			cursos.getClass(db).removeAllInstances();

			// Actualizar y cerrar base de datos
			db.commit();
			db.close();
			System.out.println("Eliminación realizada");
		} catch (MtException mte) {
			System.out.println("MtException : " + mte.getMessage());
		}
	}

	public static void modificaObjetos(String nombre, Integer nuevaHoraInicio) {

		int nAsignaturas = 0;

		try {

			// Abrir base de datos
			db.open();
			db.startTransaction();

			// Listar asignaturas
			System.out.println(asignaturas.getInstanceNumber(db) + " asignaturas en la DB.");
			nAsignaturas = (int) asignaturas.getInstanceNumber(db);

			// Crea un Iterador (propio de Java)
			MtObjectIterator<asignaturas> iter = asignaturas.<asignaturas>instanceIterator(db);

			while (iter.hasNext()) {
				asignaturas[] asig = iter.next(nAsignaturas);
				for (int i = 0; i < asig.length; i++) {
					if (asig[i].getNombre().compareTo(nombre) == 0) {
						asig[i].setHoraInicio(nuevaHoraInicio);
					}
				}
			}
			iter.close();

			// Actualizar y cerrar base de datos
			db.commit();
			db.close();
			System.out.println("Modificación realizada.");
		} catch (MtException mte) {
			System.out.println("MtException : " + mte.getMessage());
		}
	}

	public static void ejecutaOQL() {
		
		MtDatabase dbcon = new MtDatabase(hostname, dbname);
		// Abre una conexión a la base de datos
		dbcon.open();
		try {
			// Crea una instancia de Statement
			Statement stmt = dbcon.createStatement();
			String commandText = "SELECT REF(p) from academia.profesores p;";
			// Ejecuta la consulta y obtiene un ResultSet
			ResultSet rset = stmt.executeQuery(commandText);
			profesores pr1;
			
			// Lee rset uno a uno.
			while (rset.next()) {
				// Obtiene los objetos profesores
				pr1 = (profesores) rset.getObject(1);
				// Imprime los profesores
				System.out.println("############################ PROFESOR ################################## \n");
				System.out.println("Profesor: " + String.format("%16s", pr1.getNombre())
						+" "+ String.format("%16s", pr1.getApellidos()) + "\n Tlf:" + String.format("%16s", pr1.getTelefono())+ "\n DNI:" + String.format("%16s", pr1.getDni())+"\n");
			}
			// Cierra las conexiones
			rset.close();
			stmt.close();
			
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		// crearObjetos();
		// borrarObjetos();
		// modificaObjetos("Acceso a Datos", 16);
		ejecutaOQL();
	}
}
