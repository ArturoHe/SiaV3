package logica;
import java.util.ArrayList;

import IU.Interfaz;
import datos.Calificaciones;
import datos.Curso;
import datos.Estudiante;
import datos.Grupo;
import datos.HorarioAlumno;
import datos.Profesor;

public class Prueba {
	
	public static void main(String[] args) {
		
		
		
		Estudiante carlos = new Estudiante("Carlos Andres Avila", "canavila", 26, 10983165, "O+");
		Estudiante sofia = new Estudiante("Sofia Alejandra Ramos", "sofaleram", 19, 10624950, "A+");
		
		Profesor camilo = new Profesor("Carlos Arturo Perez", "carperez", "Matematicas", 91012050, null);
		Profesor mireya = new Profesor("Mireya Catalina Lozano", "mirecalozano", "Fisica", 40023585, null);
	
		Curso calculoIntegral = new Curso("Calculo Integral", 1000005, 4);
		Curso mecanica = new Curso("Fundamentos de mecanica", 1000019, 4);
		
		ArrayList<String> diasGrupo1Calculo = new ArrayList<String>() {{ add("Lunes"); add("Miercoles"); }};
		ArrayList<String> diasGrupo2Calculo = new ArrayList<String>() {{ add("Martes"); add("Jueves"); }};
		ArrayList<String> diasGrupo1Mecanica = new ArrayList<String>() {{ add("Martes"); add("Vieres"); }};
		ArrayList<String> diasGrupo2Mecanica = new ArrayList<String>() {{ add("Miercoles"); add("Viernes"); }};		
		
		Grupo grupo1Calculo = new Grupo(diasGrupo1Calculo, null, camilo, "Ingenieria 401-304", calculoIntegral, 1, 35);
		Grupo grupo2Calculo = new Grupo(diasGrupo2Calculo, null, camilo, "Agronomia 500-130", calculoIntegral, 2, 35);

		Grupo grupo1Mecanica = new Grupo(diasGrupo1Mecanica, null, mireya, "Fisica 432-120", mecanica, 12, 42);
		Grupo grupo2Mecanica = new Grupo(diasGrupo2Mecanica, null, mireya, "Ingenieria 230-69", mecanica, 23, 38);

		ArrayList<Grupo> gruposCarlos= new ArrayList<Grupo>() {{add(grupo1Calculo); add(grupo1Mecanica);}};
		
		HorarioAlumno horarioCarlos = new HorarioAlumno(gruposCarlos, carlos);
		HorarioAlumno horarioSofia = new HorarioAlumno(null, sofia);

		
		
	}
	

}
