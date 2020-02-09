package academia;

import com.matisse.MtDatabase;
import com.matisse.MtException;
import com.matisse.MtPackageObjectFactory;

public class mainAcademia {

	static MtDatabase db = new MtDatabase("localhost", "academia", new MtPackageObjectFactory("", "academia"));

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

	public static void main(String[] args) {

	}
}
