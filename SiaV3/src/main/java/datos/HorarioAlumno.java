package datos;

import java.util.List;

public class HorarioAlumno {

    // Declaracion de atributos
    private List<Grupo> grupos;
    private Estudiante estudiante;

    // Gets de los atributos
    public List<Grupo> getGrupos() {
        return this.grupos;
    }

    public Estudiante getEstudiante() {
        return this.estudiante;
    }

    // Sets de los atributos
    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    // Constructores
    public HorarioAlumno(List<Grupo> grupos, Estudiante estudiante) {
        this.setGrupos(grupos);
        this.setEstudiante(estudiante);
    }

    public HorarioAlumno(List<Grupo> grupos) {
        this(grupos, null);
    }

    // toString
    @Override
    public String toString() {
        return "\nHorario de " + this.getEstudiante().getNombre()
                + ":	\n" + this.getGrupos();
    }

}
