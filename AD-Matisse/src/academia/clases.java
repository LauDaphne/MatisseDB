/*
 * clases.java
 *
 * Generated with Matisse Schema Definition Language 9.1.12
 * Generation date: Sun Feb 09 21:02:12 2020
 */

// Note: the package and extends declarations are generated by mt_sdl, do not modify them

package academia;

import com.matisse.reflect.*;

/**
 * <code>clases</code> is a schema class generated by <code>mt_sdl</code>.
 * Any user-written classes will be found at the end of the file, after
 * the '// END of Matisse SDL Generated Code' comment.
 * Attribute types, default values, and relationship minimum and maximum
 * cardinality are stored in the database itself, not in this source code.
 * For more information, see <i>Getting Started with MATISSE</i>.
 */
public class clases extends com.matisse.reflect.MtObject {

    // BEGIN Matisse SDL Generated Code
    // DO NOT MODIFY UNTIL THE 'END of Matisse SDL Generated Code' MARK BELOW
    /*
     * Generated with Matisse Schema Definition Language 9.1.12
     * Generation Date: Sun Feb 09 21:02:12 2020
     */

    /*
     * Class variables and methods
     */

    /** Class <code>clases</code> cache ID */
    private static int CID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtClass.Loader("academia.clases"));

    /**
     * Gets the <code>clases</code> class descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a class descriptor
     */
    public static com.matisse.reflect.MtClass getClass(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtClass)db.getCachedObject(CID);
    }

    /**
     * Factory constructor. This constructor is called by <code>MtObjectFactory</code>.
     * It is public for technical reasons but is not intended to be called
     * directly by user methods.
     * @param db a database
     * @param mtOid an existing object ID in the database
     */
    public clases(com.matisse.MtDatabase db, int mtOid)  {
        super(db, mtOid);
    }

    /**
     * Cascaded constructor, used by subclasses to create a new object in the database.
     * It is protected for technical reasons but is not intended to be called
     * directly by user methods.
     * @param mtCls a class descriptor (the class to instantiate)
     */
    protected clases(com.matisse.reflect.MtClass mtCls)  {
        super(mtCls);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>instanceIterator(clases.class);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>instanceIterator(numObjPerBuffer, clases.class);
    }

    /**
     * Counts the number of instances of this class (and its subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getInstanceNumber();
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>ownInstanceIterator(clases.class);
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>ownInstanceIterator(numObjPerBuffer, clases.class);
    }

    /**
     * Counts the number of own instances of this class (excluding subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getOwnInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getOwnInstanceNumber();
    }

    /*
     * Attribute access methods
     */

    /* Attribute 'nombre' */

    /** Attribute <code>nombre</code> cache ID */
    private static int nombreCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("nombre",CID));

    /**
     * Gets the <code>nombre</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getNombreAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(nombreCID);
    }


    /**
     * Gets the <code>nombre</code> attribute value.
     * @return the value
     *
     * @see #setNombre
     * @see #removeNombre
     */
    public final String getNombre() {
        return getString(getNombreAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>nombre</code> attribute value.
     * @param val the new value
     *
     * @see #getNombre
     * @see #removeNombre
     */
    public final void setNombre(String val) {
        setString(getNombreAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>nombre</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getNombre
     * @see #setNombre
     */
    public final void removeNombre() {
        removeValue(getNombreAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getNombre
     * @see #setNombre
     */
    public final boolean isNombreNull() {
        return isNull(getNombreAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getNombre
     * @see #setNombre
     */
    public final boolean isNombreDefaultValue() {
        return isDefaultValue(getNombreAttribute(getMtDatabase()));
    }


    /* Attribute 'aula' */

    /** Attribute <code>aula</code> cache ID */
    private static int aulaCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("aula",CID));

    /**
     * Gets the <code>aula</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getAulaAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(aulaCID);
    }


    /**
     * Gets the <code>aula</code> attribute value.
     * @return the value
     *
     * @see #setAula
     * @see #removeAula
     */
    public final String getAula() {
        return getString(getAulaAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>aula</code> attribute value.
     * @param val the new value
     *
     * @see #getAula
     * @see #removeAula
     */
    public final void setAula(String val) {
        setString(getAulaAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>aula</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getAula
     * @see #setAula
     */
    public final void removeAula() {
        removeValue(getAulaAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getAula
     * @see #setAula
     */
    public final boolean isAulaNull() {
        return isNull(getAulaAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getAula
     * @see #setAula
     */
    public final boolean isAulaDefaultValue() {
        return isDefaultValue(getAulaAttribute(getMtDatabase()));
    }


    /* Attribute 'duracion' */

    /** Attribute <code>duracion</code> cache ID */
    private static int duracionCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("duracion",CID));

    /**
     * Gets the <code>duracion</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getDuracionAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(duracionCID);
    }


    /**
     * Gets the <code>duracion</code> attribute value.
     * @return the value
     *
     * @see #setDuracion
     * @see #removeDuracion
     */
    public final int getDuracion() {
        return getInteger(getDuracionAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>duracion</code> attribute value.
     * @param val the new value
     *
     * @see #getDuracion
     * @see #removeDuracion
     */
    public final void setDuracion(int val) {
        setInteger(getDuracionAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>duracion</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getDuracion
     * @see #setDuracion
     */
    public final void removeDuracion() {
        removeValue(getDuracionAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getDuracion
     * @see #setDuracion
     */
    public final boolean isDuracionNull() {
        return isNull(getDuracionAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getDuracion
     * @see #setDuracion
     */
    public final boolean isDuracionDefaultValue() {
        return isDefaultValue(getDuracionAttribute(getMtDatabase()));
    }


    /* Attribute 'horaInicio' */

    /** Attribute <code>horaInicio</code> cache ID */
    private static int horaInicioCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("horaInicio",CID));

    /**
     * Gets the <code>horaInicio</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getHoraInicioAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(horaInicioCID);
    }


    /**
     * Gets the <code>horaInicio</code> attribute value.
     * @return the value
     *
     * @see #setHoraInicio
     * @see #removeHoraInicio
     */
    public final int getHoraInicio() {
        return getInteger(getHoraInicioAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>horaInicio</code> attribute value.
     * @param val the new value
     *
     * @see #getHoraInicio
     * @see #removeHoraInicio
     */
    public final void setHoraInicio(int val) {
        setInteger(getHoraInicioAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>horaInicio</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getHoraInicio
     * @see #setHoraInicio
     */
    public final void removeHoraInicio() {
        removeValue(getHoraInicioAttribute(getMtDatabase()));
    }

    /**
     * Check if nullable attribute value is set to MT_NULL.
     * @return true if null value
     *
     * @see #getHoraInicio
     * @see #setHoraInicio
     */
    public final boolean isHoraInicioNull() {
        return isNull(getHoraInicioAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getHoraInicio
     * @see #setHoraInicio
     */
    public final boolean isHoraInicioDefaultValue() {
        return isDefaultValue(getHoraInicioAttribute(getMtDatabase()));
    }


    /*
     * Relationship access methods
     */

    /* Relationship 'impartidas_por' */

    /** Relationship <code>impartidas_por</code> cache ID */
    private static int impartidas_porCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtRelationship.Loader("impartidas_por",CID));

    /**
     * Gets the <code>impartidas_por</code> relationship descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a relationship descriptor object
     */
    public static com.matisse.reflect.MtRelationship getImpartidas_porRelationship(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtRelationship)db.getCachedObject(impartidas_porCID);
    }

    /**
     * Gets the <code>impartidas_por</code> relationship's successors.
     * @return an array of objects
     *
     * @see #getImpartidas_porSize
     * @see #impartidas_porIterator
     * @see #setImpartidas_por
     * @see #removeImpartidas_por
     */
    public final academia.profesores[] getImpartidas_por() {
        return (academia.profesores[])getSuccessors(getImpartidas_porRelationship(getMtDatabase()), academia.profesores.class);
    }

    /**
     * Counts the <code>impartidas_por</code> relationship's successors.
     * @return the number of successors
     *
     * @see #getImpartidas_por
     * @see #impartidas_porIterator
     * @see #setImpartidas_por
     * @see #removeImpartidas_por
     */
    public final int getImpartidas_porSize() {
        return getSuccessorSize(getImpartidas_porRelationship(getMtDatabase()));
    }

    /**
     * Opens an iterator on the <code>impartidas_por</code> relationship's successors.
     * @param <E> a MtObject class     * @return an object iterator
     *
     * @see #getImpartidas_por
     * @see #getImpartidas_porSize
     * @see #setImpartidas_por
     * @see #removeImpartidas_por
     */
    public final <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> impartidas_porIterator() {
        return this.<E>successorIterator(getImpartidas_porRelationship(getMtDatabase()), academia.profesores.class);
    }

    /**
     * Sets the <code>impartidas_por</code> relationship's successors.
     * @param succs an array of objects
     *
     * @see #getImpartidas_por
     * @see #getImpartidas_porSize
     * @see #impartidas_porIterator
     * @see #removeImpartidas_por
     */
    public final void setImpartidas_por(academia.profesores[] succs) {
        setSuccessors(getImpartidas_porRelationship(getMtDatabase()), succs);
    }

    /**
     * Inserts one object at the beginning of the existing <code>impartidas_por</code> successors list.
     * @param succ the object to add
     *
     * @see #getImpartidas_por
     * @see #getImpartidas_porSize
     * @see #impartidas_porIterator
     * @see #setImpartidas_por
     * @see #removeImpartidas_por
     */
    public final void prependImpartidas_por(academia.profesores succ) {
        prependSuccessor(getImpartidas_porRelationship(getMtDatabase()), succ);
    }

    /**
     * Adds one object to the end of the existing <code>impartidas_por</code> successors list.
     * @param succ the object to add
     *
     * @see #getImpartidas_por
     * @see #setImpartidas_por
     * @see #removeImpartidas_por
     * @see #getImpartidas_porSize
     * @see #impartidas_porIterator
     */
    public final void appendImpartidas_por(academia.profesores succ) {
        appendSuccessor(getImpartidas_porRelationship(getMtDatabase()), succ);
    }
    /** Adds multiple objects to the end of the existing <code>impartidas_por</code> successors list.
     * @param succs an array of objects to add
     *
     * @see #getImpartidas_por
     * @see #setImpartidas_por
     * @see #removeImpartidas_por
     * @see #getImpartidas_porSize
     * @see #impartidas_porIterator
     */
    public final void appendImpartidas_por(academia.profesores[] succs) {
        addSuccessors(getImpartidas_porRelationship(getMtDatabase()), succs);
    }

    /**
     * Removes objects from the <code>impartidas_por</code> successors list.
     * @param succs an array of objects to remove
     *
     * @see #getImpartidas_por
     * @see #setImpartidas_por
     * @see #getImpartidas_porSize
     * @see #impartidas_porIterator
     */
    public void removeImpartidas_por(academia.profesores[] succs) {
        removeSuccessors(getImpartidas_porRelationship(getMtDatabase()), succs);
    }

    /**
     * Removes one object from the <code>impartidas_por</code> successors list.
     * @param succ the object to remove
     *
     * @see #getImpartidas_por
     * @see #setImpartidas_por
     * @see #getImpartidas_porSize
     * @see #impartidas_porIterator
     */
    public void removeImpartidas_por(academia.profesores succ) {
        removeSuccessor(getImpartidas_porRelationship(getMtDatabase()), succ);
    }

    /**
     * Removes all <code>impartidas_por</code> successors.  When the minimum cardinality
     * is 1, a new successor must be set before commit.
     */
    public final void clearImpartidas_por() {
        clearSuccessors(getImpartidas_porRelationship(getMtDatabase()));
    }


    // END of Matisse SDL Generated Code

    /*
     * You may add your own code here...
     */

    /**
     * Default constructor provided as an example.
     * You may delete this constructor or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @param db a database
     */
    public clases(com.matisse.MtDatabase db) {
        super(getClass(db));
    }

    /**
     * Example of <code>toString</code> method.
     * You may delete this method or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @return a string
     */
    public java.lang.String toString() {
        return super.toString() + "[clases]";
    }
}
