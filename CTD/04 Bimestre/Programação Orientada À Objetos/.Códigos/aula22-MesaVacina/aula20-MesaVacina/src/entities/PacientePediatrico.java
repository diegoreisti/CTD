package entities;

public class PacientePediatrico extends PostoSaude {
    private String nome;

    public PacientePediatrico() {
    }

    public PacientePediatrico(String nome, int qtdDosesAplicadas) {
        this.nome = nome;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
