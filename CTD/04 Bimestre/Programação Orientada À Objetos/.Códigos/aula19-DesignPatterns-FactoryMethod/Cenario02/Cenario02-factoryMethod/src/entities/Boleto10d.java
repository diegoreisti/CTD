package entities;

import entities.Boleto;

public class Boleto10d extends Boleto {

    // Construtor
    public Boleto10d(double valor) {
        super(valor);
        this.juro = 0.02;
        this.desconto = 0.1;
        this.multa = 0.05;
    }
}
