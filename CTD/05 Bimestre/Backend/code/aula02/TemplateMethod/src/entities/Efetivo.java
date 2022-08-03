package entities;

import java.time.LocalDateTime;

public class Efetivo extends Funcionario{

    private double salarioBase;
    private double descontos;
    private double bonificacoes;

    public Efetivo(String nome, String sobrenome, String numeroConta, double salarioBase, double descontos, double bonificacoes) {
        super(nome, sobrenome, numeroConta);
        this.salarioBase = salarioBase;
        this.descontos = descontos;
        this.bonificacoes = bonificacoes;
    }

    @Override
    public double calcularSaldo() {
        return salarioBase + bonificacoes - descontos;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Gerado um recibo de papel - Efetivo as " + LocalDateTime.now() + " no valor de " + quantia);
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("Foi depositada uma quantida de " + quantia + " na conta nº " + super.getNumeroConta() + " referente ao cliente " + super.getNome());
    }
}
