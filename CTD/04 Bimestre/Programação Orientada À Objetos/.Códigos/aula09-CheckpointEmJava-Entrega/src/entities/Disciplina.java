package entities;

public class Disciplina {
    private int id;
    private String nomeDisciplina;
    private int cargaHoraria;

    public Disciplina() {
    }

    public Disciplina(int id, String nomeDisciplina, int cargaHoraria) {
        this.id = id;
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", nomeDisciplina='" + nomeDisciplina + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
