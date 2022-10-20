package entities;

public class PacienteAdulto extends PostoSaude {
    private String nome;

    public PacienteAdulto() {
    }

    public PacienteAdulto(String nome, int qtdDosesAplicadas) {
        this.nome = nome;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
