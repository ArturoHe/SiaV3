package datos;

public class EvaluacionDocente {
	
	// Decalracion de atributos
	
	private Estudiante estudiante;
	private Profesor profesorAEvaluar;
	private Grupo grupo;
	private double calificacion;
	
	// Gets de los atributos
	
	public Estudiante getEstudiante() {
		return this.estudiante;
	}
	
	public Profesor getProfesorAEvaluar() {
		return this.profesorAEvaluar;
	}
	
	public Grupo getGrupo() {
		return this.grupo;
	}
	
	public double getCalificacion() {
		return this.calificacion;
	}
	
	// Sets de los atributos
	
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
	public void setProfesorAEvaluar(Profesor profesorAEvaluar) {
		this.profesorAEvaluar = profesorAEvaluar;
	}
	
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	// Constructores
	
	public EvaluacionDocente(Estudiante estudiante, Profesor profesorAEvaluar, Grupo grupo, double calificacion) {
		this.setEstudiante(estudiante);
		this.setProfesorAEvaluar(profesorAEvaluar);
		this.setGrupo(grupo);
		this.setCalificacion(calificacion);
	}
	
	public EvaluacionDocente(Estudiante estudiante, Profesor profesorAEvaluar, Grupo grupo) {
		this(estudiante, profesorAEvaluar, grupo, 0);
	}
	
	public EvaluacionDocente(Estudiante estudiante, Profesor profesorAEvaluar) {
		this(estudiante, profesorAEvaluar, null, 0);
	}
	
	public EvaluacionDocente(Estudiante estudiante) {
		this(estudiante, null, null, 0);
	}
	
	// toString
	
	@Override
	public String toString() {
		return "\nEstudiante: "+this.getEstudiante().getNombre()
				+"\nProfesor a evaluar: "+this.getProfesorAEvaluar().getNombre()
				+"\nGrupo a cargo: "+this.getGrupo().getCursoAsociado().getNombre()
				+", grupo "+this.getGrupo().getNumeroDeGrupo()
				+"\nCalificacion numerica por parte del estudiante: "+this.getCalificacion()+"\n";
	}

}
