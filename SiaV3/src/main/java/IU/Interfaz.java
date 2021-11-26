package IU;

import java.util.ArrayList;
import java.util.Scanner;

import datos.*;

public class Interfaz {

    public static void darBienvenida() {
        System.out.println("Bienvenido al Sistema de Informacion Academica - SIA");
    }

    public static void imprimirIngresoId() {
        System.out.println("|*---------------------------------------*|");
        System.out.println("Por favor ingrese su ID:");
    }

    public static void mostrarMenu() {
        System.out.println("|*---------------------------------------*|");
        System.out.println("	Servicios disponibles:\n"
                + "\n( 1 ) Datos Personales del alumno"
                + "\n( 2 ) Calificaciones del alumno"
                + "\n( 3 ) Horario del alumno"
                + "\n( 4 ) Cursos ofertados"
                + "\n( 5 ) Evaluacion docente"
                + "\n( 6 ) Cerrar sesion");
        System.out.println("\n*Recuerde que el sistema se cierra UNICAMENTE si ingrese la opcion 6*");
        System.out.println("\nPor favor ingrese una opcion: ");

    }

    public static String leerOpcionStr() {
        Scanner scs = new Scanner(System.in);
        String opcionStr = scs.nextLine();
        return opcionStr;
    }

    public static int leerOpcionInt() {
        Scanner sci = new Scanner(System.in);
        int opcionInt = sci.nextInt();
        return opcionInt;
    }

    public static void imprimirEstudiante(Estudiante a) {
        System.out.println(a);
    }

    public static void imprimirCalificaciones(Calificaciones c) {
        System.out.println(c);
    }

    public static void imprimirHorario(HorarioAlumno horario) {
        System.out.println(horario);
    }

    public static void imprimirListaCursos(ArrayList<Curso> cursos) {
        for (Curso c : cursos) {
            System.out.println(c);
        }
    }

    public static void imprimirEvaluacionDocente(EvaluacionDocente ev) {
        System.out.println("El tiempo para realizar la evaluacion docente ha finalizado");//Se supone que ya cerro la encuesta para evaluacion docente
        System.out.println("Resultados de la ultima evaluacion docente:");
        System.out.println(ev);
    }

    public static void imprimirDespedida() {
        System.out.println("Gracias por utilizar el miniSIA");
        System.out.println("Hasta pronto");
    }

    public static void imprimirEleccionMateria() {
        System.out.println("Que materia desea consultar?"
                + "\n( 1 ) Calculo"
                + "\n( 2 ) Mecanica"
                + "\n( 3 ) Salir");
    }

    public static void imprimirErrorId() {
        System.out.println("El id ingresado no es valido");
    }

}
