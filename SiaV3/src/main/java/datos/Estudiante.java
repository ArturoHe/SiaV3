package datos;

public class Estudiante {

    // Declaracion de atributos
    private String nombre;
    private String usuario;
    private String id;
    private int edad;
    private String tipoSangre;

    // Gets de los atributos
    public String getNombre() {
        return this.nombre;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public String getId() {
        return this.id;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getTipoSangre() {
        return this.tipoSangre;
    }

    // Sets de los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    // Constructores
    public Estudiante(String nombre, String usuario, int edad, String id, String tipoSangre) {
        this.setNombre(nombre);
        this.setUsuario(usuario);
        this.setEdad(edad);
        this.setId(id);
        this.setTipoSangre(tipoSangre);
    }

    public Estudiante(String nombre, String usuario, int edad, String id) {
        this.setNombre(nombre);
        this.setUsuario(usuario);
        this.setId(id);
        this.setEdad(edad);

    }

    public Estudiante(String nombre, String usuario, int edad) {
        this.setNombre(nombre);
        this.setUsuario(usuario);
        this.setEdad(edad);
    }

    public Estudiante(String nombre, String usuario) {
        this.setNombre(nombre);
        this.setUsuario(usuario);
    }

    public Estudiante(String nombre) {
        this.setNombre(nombre);
    }

    // toString
    @Override
    public String toString() {
        return "\nMis datos personales son los siguientes:\n"
                + "Nombre: " + this.getNombre()
                + "\nUsuario SIA: " + this.getUsuario()
                + "\nEdad: " + this.getEdad()
                + "\nID: " + this.getId()
                + "\nTipo de sangre: " + this.getTipoSangre() + "\n";
    }

}
