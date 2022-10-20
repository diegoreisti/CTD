package entities.states;

import entities.Carro;
import entities.EstadoCarro;

public class SemGasolina implements EstadoCarro {

    private Carro v;

    public SemGasolina(Carro v) {
        this.v = v;
    }

    @Override
    public void ligar() {
        System.out.println("Abasteça o carro primeiro.");
    }

    @Override
    public void acelerar() {
        System.out.println("Abasteça o carro primeiro para poder acelerar.");
    }

    @Override
    public void freiar() {
        System.out.println("O carro não está em movimento.");
    }
}
