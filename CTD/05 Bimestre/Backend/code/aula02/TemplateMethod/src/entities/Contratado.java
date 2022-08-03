package entities;

import java.time.LocalDateTime;

public class Contratado extends Funcionario{
    private double valorHora;
    private int horas;

    public Contratado(String nome, String sobrenome, String numeroConta, double valorHora, int horas) {
        super(nome, sobrenome, numeroConta);
        this.valorHora = valorHora;
        this.horas = horas;
    }

    @Override
    public double calcularSaldo() {
        return this.valorHora * this.horas;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Gerado um recibo de papel - Contratado as " + LocalDateTime.now() + " no valor de " + quantia);
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("Foi depositada uma quantida de " + quantia + " na conta nº " + super.getNumeroConta() + " referente ao cliente " + super.getNome());
    }
}
