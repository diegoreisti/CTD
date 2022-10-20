package entities;

public class Cliente {
    private int numeroCliente;
    private String nome;
    private double divida;

    public Cliente() {
    }

    public Cliente(int numeroCliente, String nome) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDivida() {
        return divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public void aumentarDivida(double valor){
        this.divida += valor;
    }

    public void pagarDivida(double valor){
        this.divida -= valor;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numeroCliente=" + numeroCliente +
                ", nome='" + nome + '\'' +
                ", divida=" + divida +
                '}';
    }
}
