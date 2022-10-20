package entities;

public abstract class Conta {
    private double saldo;

    public Conta() {
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.printf("Depósito de %.2f realizado com sucesso. Saldo de R$ %,2f\n", valor, informarSaldo());
    }

    public abstract void sacar(double valor);

    public abstract void sacar(double valor, double perc);

    public double informarSaldo(){
        return this.saldo;
    }
}
