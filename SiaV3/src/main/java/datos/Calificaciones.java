package datos;

public class Calificaciones {

    // Declaracion de atributos
    private Grupo grupoAsociado;
    private Estudiante estudiante;
    private double calificacion;
    private double promedioGeneral;

    // Gets de los atributos 
    public Grupo getGrupoAsociado() {
        return this.grupoAsociado;
    }

    public Estudiante getEstudiante() {
        return this.estudiante;
    }

    public double getCalificacion() {
        return this.calificacion;
    }

    public double getPromedioGeneral() {
        return this.promedioGeneral;
    }

    // Sets de los atributos
    public void setGrupoAsociado(Grupo grupoAsociado) {
        this.grupoAsociado = grupoAsociado;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void setPromedioGeneral(double promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }

    // Constructores
    public Calificaciones(Grupo grupoAsociado, Estudiante estudiante, double calificacion, double promedioGeneral) {
        this.setGrupoAsociado(grupoAsociado);
        this.setEstudiante(estudiante);
        this.setCalificacion(calificacion);
        this.setPromedioGeneral(promedioGeneral);
    }

    public Calificaciones(Grupo grupoAsociado, Estudiante estudiante, double calificacion) {
        this(grupoAsociado, estudiante, calificacion, 0);
    }

    public Calificaciones(Grupo grupoAsociado, Estudiante estudiante) {
        this(grupoAsociado, estudiante, 0, 0);
    }

    public Calificaciones(Grupo grupoAsociado) {
        this(grupoAsociado, null, 0, 0);
    }

    // toString
    @Override
    public String toString() {
        return "\nCalificaciones del alumno: " + this.getEstudiante().getNombre()
                + "\nCurso: " + this.getGrupoAsociado().getCursoAsociado().getNombre()
                + "\nCalificaci�n: " + this.getCalificacion()
                + "\nPromedio General: " + this.getPromedioGeneral() + "\n";
    }

}
