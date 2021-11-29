package datos;

public class Curso {

    // Declaracion de atributos
    private String nombre;
    private int id;
    private int grado;

    // Gets de los atributos
    public String getNombre() {
        return this.nombre;
    }

    public int getId() {
        return this.id;
    }

    public int getGrado() {
        return this.grado;
    }

    // Sets de los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    // Constructores
    public Curso(String nombre, int id, int grado) {
        this.setNombre(nombre);
        this.setId(id);
        this.setGrado(grado);
    }

    public Curso(String nombre, int id) {
        this(nombre, id, 0);
    }

    public Curso(String nombre) {
        this(nombre, 0, 0);
    }

    // toString
    @Override
    public String toString() {
        return "\nNombre del curso: " + this.getNombre()
                + "\nID: " + this.getId()
                + "\nGrado: " + this.getGrado() + "\n";
    }
}
