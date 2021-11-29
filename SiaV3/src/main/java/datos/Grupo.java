package datos;

import java.time.LocalTime;
import java.util.List;

public class Grupo {

    //Declaracion de atributos
    private List<String> diasSemana;
    private LocalTime horaDelDia;
    private Profesor dictadoPor;
    private String salon;
    private Curso cursoAsociado;
    private int numeroDeGrupo;
    private int cantidadEstudiantes;

    // Gets de los atributos
    public List<String> getDiasSemana() {
        return this.diasSemana;
    }

    public LocalTime getHoraDelDia() {
        return this.horaDelDia;
    }

    public Profesor getDictadoPor() {
        return this.dictadoPor;
    }

    public Curso getCursoAsociado() {
        return this.cursoAsociado;
    }

    public String getSalon() {
        return this.salon;
    }

    public int getNumeroDeGrupo() {
        return this.numeroDeGrupo;
    }

    public int getCantidadEstudiantes() {
        return this.cantidadEstudiantes;
    }

    // Sets de los atributos
    public void setDiasSemana(List<String> diasSemana) {
        this.diasSemana = diasSemana;
    }

    public void setHoraDelDia(LocalTime hora) {
        this.horaDelDia = hora;
    }

    public void setDictadoPor(Profesor dictadoPor) {
        this.dictadoPor = dictadoPor;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public void setCursoAsociado(Curso cursoAsociado) {
        this.cursoAsociado = cursoAsociado;
    }

    public void setNumeroDeGrupo(int numeroDeGrupo) {
        this.numeroDeGrupo = numeroDeGrupo;
    }

    public void setCantidadEstudiantes(int cantidadEstudiantes) {
        this.cantidadEstudiantes = cantidadEstudiantes;
    }

    // Constructores
    public Grupo(List<String> diasSemana, LocalTime horaDelDia, Profesor dictadoPor, String salon, Curso cursoAsociado, int numeroDeGrupo, int cantidadEstudiantes) {
        this.setDiasSemana(diasSemana);
        this.setHoraDelDia(horaDelDia);
        this.setDictadoPor(dictadoPor);
        this.setSalon(salon);
        this.setCursoAsociado(cursoAsociado);
        this.setNumeroDeGrupo(numeroDeGrupo);
        this.setCantidadEstudiantes(cantidadEstudiantes);
    }

    public Grupo(List<String> diasSemana, LocalTime horaDelDia, Profesor dictadoPor, String salon, Curso cursoAsociado, int numeroDeGrupo) {
        this(diasSemana, horaDelDia, dictadoPor, salon, cursoAsociado, numeroDeGrupo, 0);
    }

    public Grupo(List<String> diasSemana, LocalTime horaDelDia, Profesor dictadoPor, String salon, Curso cursoAsociado) {
        this(diasSemana, horaDelDia, dictadoPor, salon, cursoAsociado, 0, 0);
    }

    public Grupo(List<String> diasSemana, LocalTime horaDelDia, Profesor dictadoPor, String salon) {
        this(diasSemana, horaDelDia, dictadoPor, salon, null, 0, 0);
    }

    public Grupo(List<String> diasSemana, LocalTime horaDelDia, Profesor dictadoPor) {
        this(diasSemana, horaDelDia, dictadoPor, null, null, 0, 0);
    }

    public Grupo(List<String> diasSemana, LocalTime horaDelDia) {
        this(diasSemana, horaDelDia, null, null, null, 0, 0);
    }

    public Grupo(List<String> diasSemana) {
        this(diasSemana, null, null, null, null, 0, 0);
    }

    // toString
    @Override
    public String toString() {
        return "\n\nCurso: " + this.getCursoAsociado().getNombre()
                + "\nNumero de Grupo: " + this.getNumeroDeGrupo()
                + "\nDictado por: " + this.getDictadoPor().getNombre()
                + "\nCantidad de estudiantes: " + this.getCantidadEstudiantes()
                + "\nHorario:\n	Dias: " + this.getDiasSemana()
                + "\n	Hora: " + this.getHoraDelDia()
                + "\nSalon: " + this.getSalon();
    }

}
