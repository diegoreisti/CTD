package entities;

public class ContaCorrente extends Conta implements GravarImposto{

    private double valorPermitido;

    public ContaCorrente(double saldo, double valorPermitido) {
        super(saldo);
        this.valorPermitido = valorPermitido;
    }

    @Override
    public void sacar(double valor) {
    }

    @Override
    public void sacar(double valor, double perc) {
        if (valor <= informarSaldo()){
            setSaldo(informarSaldo() - valor - (valor * imposto(perc)));
            System.out.printf("\nSaque de %.2f efetuado. Saldo atual: R$ %.2f. (imposto = %.2f ). ", valor, informarSaldo(), (valor * imposto(perc)));
        } else {
            System.out.println("Limite excedido!");
        }
    }

    @Override
    public double imposto(double perc) {
        return perc / 100;
    }
}
