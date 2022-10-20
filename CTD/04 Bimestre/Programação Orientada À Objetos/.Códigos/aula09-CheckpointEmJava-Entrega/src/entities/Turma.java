package entities;

import java.util.Arrays;

public class Turma {
    private int id;
    private String nome;
    private String sala;
    private int vagas;
    private Aluno[] alunos;
    private Serie serie;


    public Turma() {
    }

    public Turma(int id, String nome, String sala, int vagas, Aluno[] alunos, Serie serie) {
        this.id = id;
        this.nome = nome;
        this.sala = sala;
        this.vagas = vagas;
        this.alunos = alunos;
        this.serie = serie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sala='" + sala + '\'' +
                ", vagas=" + vagas +
                ", alunos=" + Arrays.toString(alunos) +
                ", serie=" + serie +
                '}';
    }
}
