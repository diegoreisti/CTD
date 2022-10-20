package entities;

import java.util.Arrays;

public class Serie {
    private int id;
    private String nomeSerie;
    private Disciplina[] disciplinas;

    public Serie() {
    }

    public Serie(int id, String nomeSerie, Disciplina[] disciplinas) {
        this.id = id;
        this.nomeSerie = nomeSerie;
        this.disciplinas = disciplinas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeSerie() {
        return nomeSerie;
    }

    public void setNomeSerie(String nomeSerie) {
        this.nomeSerie = nomeSerie;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", nomeSerie='" + nomeSerie + '\'' +
                ", disciplinas=" + Arrays.toString(disciplinas) +
                '}';
    }
}
