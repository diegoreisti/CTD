package entities;

public class ContaCliente {
    protected int id;
    protected int agencia;
    protected int numero;
    protected String nome;
    protected double saldo;
    protected  double limite;

    public ContaCliente() {
    }

    public ContaCliente(int id, int agencia, int numero, String nome, double saldo, double limite) {
        this.id = id;
        this.agencia = agencia;
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }


    @Override
    public String toString() {
        return "ContaCliente{" +
                "id=" + id +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}
