package datos;

import java.util.List;


public class Profesor {

    // Declaracion de atributos
    private String nombre;
    private String usuario;
    private String departamento;
    private String id;
    private List<Grupo> grupos;

    //Gets de atributos
    public String getNombre() {
        return this.nombre;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public String getId() {
        return this.id;
    }

    public List<Grupo> getGrupos() {
        return this.grupos;
    }

    // Sets de atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    // Constructores
    public Profesor(String nombre, String usuario, String departamento, String id, List<Grupo> grupos) {
        this.setNombre(nombre);
        this.setUsuario(usuario);
        this.setDepartamento(departamento);
        this.setId(id);
        this.setGrupos(grupos);
    }

    public Profesor(String nombre, String usuario, String departamento, String id) {
        this(nombre, usuario, departamento, id, null);
    }

    public Profesor(String nombre, String usuario, String departamento) {
        this(nombre, usuario, departamento, "", null);
    }

    public Profesor(String nombre, String usuario) {
        this(nombre, usuario, null, "", null);
    }

    public Profesor(String nombre) {
        this(nombre, null, null, "", null);
    }

    @Override
    public String toString() {
        return "Soy docente de la Institucion Educativa X. Mis datos son los siguientes:\n"
                + "Nombre: " + this.getNombre()
                + "\nUsuario SIA: " + this.getUsuario()
                + "\nDepartamento: " + this.getDepartamento()
                + "\nID: " + this.getId()
                + "\nGrupos a los que ense�o: " + this.getGrupos();
    }

}
