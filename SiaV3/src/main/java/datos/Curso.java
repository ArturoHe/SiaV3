package datos;

public class Curso {
	
	// Declaracion de atributos
	
	private String nombre;
	private int id;
	private int creditos;
	
	// Gets de los atributos
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getCreditos() {
		return this.creditos;
	}
	
	// Sets de los atributos
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	
	// Constructores
	
	public Curso(String nombre, int id, int creditos) {
		this.setNombre(nombre);
		this.setId(id);
		this.setCreditos(creditos);
	}
	
	public Curso(String nombre, int id) {
		this(nombre,id,0);
	}
	
	public Curso(String nombre) {
		this(nombre,0,0);
	}
	
	// toString
	
	@Override
	public String toString() {
		return "\nNombre del curso: "+this.getNombre()
				+"\nID: "+this.getId()
				+"\nNumero de creditos: "+this.getCreditos()+"\n";
	}
}

