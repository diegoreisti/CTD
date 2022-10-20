package entities;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= informarSaldo()){
            setSaldo(informarSaldo()-valor);
            System.out.printf("Saque de R$ %.2f realizado. Saldo atual R$ %.2f", valor, informarSaldo());
        } else {
            System.out.println("Saldo insuficiente para o saque!");
        }
    }

    @Override
    public void sacar(double valor, double perc) {
    }

    public void cobrarJuros(){
        double juros = 0.05;
        setSaldo(informarSaldo() * (1 - juros));
    }
}
