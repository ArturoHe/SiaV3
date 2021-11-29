package logica;

import java.util.ArrayList;

import IU.Interfaz;
import datos.Calificaciones;
import datos.*;
import java.time.LocalTime;

public class Prueba {

    public static void main(String[] args) {

        //Estudiantes
        Estudiante e0001 = new Estudiante("Carlos Andres Avila", "canavila", 16, "e0001", "O+");
        Estudiante e0002 = new Estudiante("Sofia Alejandra Ramos", "sofaleram", 17, "e0002", "A+");

        //Profesores
        Profesor p0001 = new Profesor("Carlos Arturo Perez", "carperez", "Matematicas", "p0001", null);
        Profesor p0002 = new Profesor("Mireya Catalina Lozano", "mirecalozano", "Fisica", "p0002", null);

        //Cursos
        Curso precalculo = new Curso("Pre Calculo", 1000005, 11);
        Curso mecanica = new Curso("Fundamentos de mecanica", 1000019, 11);

        //Dias de los Cursos
        ArrayList<String> diasGrupo1Calculo = new ArrayList<String>() {
            {
                add("Lunes");
                add("Miercoles");
            }
        };
        ArrayList<String> diasGrupo2Calculo = new ArrayList<String>() {
            {
                add("Martes");
                add("Jueves");
            }
        };
        ArrayList<String> diasGrupo1Mecanica = new ArrayList<String>() {
            {
                add("Martes");
                add("Vieres");
            }
        };
        ArrayList<String> diasGrupo2Mecanica = new ArrayList<String>() {
            {
                add("Miercoles");
                add("Viernes");
            }
        };

        //Grupos de cada Curso
        Grupo grupo1Calculo = new Grupo(diasGrupo1Calculo, LocalTime.of(8, 0), p0001, "Salon 401", precalculo, 1, 27);
        Grupo grupo2Calculo = new Grupo(diasGrupo2Calculo, LocalTime.of(10, 0), p0001, "Salon 401", precalculo, 2, 25);

        Grupo grupo1Mecanica = new Grupo(diasGrupo1Mecanica, LocalTime.of(8, 0), p0002, "Salon 203", mecanica, 12, 32);
        Grupo grupo2Mecanica = new Grupo(diasGrupo2Mecanica, LocalTime.of(10, 0), p0002, "Salon 203", mecanica, 23, 28);

        //Grupos de cada Profesor y Set de Grupo
        ArrayList<Grupo> grupoP0001 = new ArrayList<Grupo>() {
            {
                add(grupo1Calculo);
                add(grupo2Calculo);
            }
        };
        p0001.setGrupos(grupoP0001);

        ArrayList<Grupo> grupoP0002 = new ArrayList<Grupo>() {
            {
                add(grupo1Mecanica);
                add(grupo2Mecanica);
            }
        };
        p0002.setGrupos(grupoP0002);

        //Grupos Estudiantes
        ArrayList<Grupo> grupose0001 = new ArrayList<Grupo>() {
            {
                add(grupo1Calculo);
                add(grupo1Mecanica);
            }
        };

        ArrayList<Grupo> grupose0002 = new ArrayList<Grupo>() {
            {
                add(grupo2Calculo);
                add(grupo2Mecanica);
            }
        };

        //Horarios Estudiantes
        HorarioAlumno horarioe0001 = new HorarioAlumno(grupose0001, e0001);
        HorarioAlumno horarioe0002 = new HorarioAlumno(grupose0002, e0002);

        //Evaluacion Docente
        EvaluacionDocente evaCamilo = new EvaluacionDocente(e0001, p0001, grupo1Calculo, 4.5);
        EvaluacionDocente evaMireya = new EvaluacionDocente(e0001, p0002, grupo1Mecanica, 4.8);

        //Calificaciones del Estudiante
        Calificaciones califiCalculoe0001 = new Calificaciones(grupo2Calculo, e0001, 4.6, 4.8);
        Calificaciones califiMecanicae0001 = new Calificaciones(grupo2Mecanica, e0001, 4.4, 4.2);

        Calificaciones califiCalculoe0002 = new Calificaciones(grupo2Calculo, e0002, 4.9, 4.6);
        Calificaciones califiMecanicae0002 = new Calificaciones(grupo2Mecanica, e0002, 4.8, 4.0);

        //Cursos Ofertados
        Curso matematicasBasicas = new Curso("Matematicas Basicas", 1002005, 1);
        Curso español = new Curso("Español", 1050019, 4);
        Curso geometria = new Curso("Geometria", 1120005, 6);
        Curso ingles = new Curso("Ingles", 100589, 4);
        Curso religion = new Curso("Religion", 1000258, 2);
        Curso eticaYValores = new Curso("Etica y valores", 1128019, 1);
        Curso sociales = new Curso("Sociales", 2350005, 2);
        Curso biologia = new Curso("Biologia", 45000019, 5);
        Curso quimica = new Curso("Quimica", 4000005, 11);
        Curso artistica = new Curso("Artistica", 2000019, 1);

        ArrayList<Curso> cursosOfertados = new ArrayList<Curso>() {
            {
                add(precalculo);
                add(mecanica);
                add(matematicasBasicas);
                add(español);
                add(geometria);
                add(ingles);
                add(religion);
                add(eticaYValores);
                add(sociales);
                add(biologia);
                add(quimica);
                add(artistica);
            }
        };

        //Id's validos para el login
        ArrayList<String> idValidos = new ArrayList<String>() {
            {
                add("e0001");
                add("e0002");
            }
        };
        //------------------------------------------------------testFuncionamiento----------------------------------------------------------//

        Interfaz.darBienvenida();
        Interfaz.imprimirIngresoId();
        boolean idExitoso = false;
        String id = Interfaz.leerOpcionStr();
        idExitoso = idValidos.contains(id);

        while (idExitoso != true) {
            Interfaz.imprimirErrorId();
            Interfaz.imprimirIngresoId();
            id = Interfaz.leerOpcionStr();
            idExitoso = idValidos.contains(id);

        }

        switch (id) {
            case "e0001":
                int eleccion = 0;
                while (eleccion != 6) {
                    Interfaz.mostrarMenu();
                    eleccion = Interfaz.leerOpcionInt();
                    switch (eleccion) {
                        case 1 ->
                            Interfaz.imprimirEstudiante(e0001);
                        case 2 -> {
                            int eleccionMateria = 0;
                            while (eleccionMateria != 3) {
                                Interfaz.imprimirEleccionMateria();
                                eleccionMateria = Interfaz.leerOpcionInt();
                                switch (eleccionMateria) {
                                    case 1 ->
                                        Interfaz.imprimirCalificaciones(califiCalculoe0001);
                                    case 2 ->
                                        Interfaz.imprimirCalificaciones(califiMecanicae0001);
                                }
                            }
                        }
                        case 3 ->
                            Interfaz.imprimirHorario(horarioe0001);
                        case 4 ->
                            Interfaz.imprimirListaCursos(cursosOfertados);
                        case 5 ->
                            Interfaz.imprimirEvaluacionDocente(evaCamilo);
                        case 6 ->
                            Interfaz.imprimirDespedida();

                    }

                }
                break;

            case "e0002":
                eleccion = 0;
                while (eleccion != 6) {
                    Interfaz.mostrarMenu();
                    eleccion = Interfaz.leerOpcionInt();
                    switch (eleccion) {
                        case 1 ->
                            Interfaz.imprimirEstudiante(e0002);
                        case 2 -> {
                            int eleccionMateria = 0;
                            while (eleccionMateria != 3) {
                                Interfaz.imprimirEleccionMateria();
                                eleccionMateria = Interfaz.leerOpcionInt();
                                switch (eleccionMateria) {
                                    case 1 ->
                                        Interfaz.imprimirCalificaciones(califiCalculoe0002);
                                    case 2 ->
                                        Interfaz.imprimirCalificaciones(califiMecanicae0002);
                                }
                            }
                        }
                        case 3 ->
                            Interfaz.imprimirHorario(horarioe0002);
                        case 4 ->
                            Interfaz.imprimirListaCursos(cursosOfertados);
                        case 5 ->
                            Interfaz.imprimirEvaluacionDocente(evaMireya);
                        case 6 ->
                            Interfaz.imprimirDespedida();

                    }

                }
                break;
        }

    }

}
