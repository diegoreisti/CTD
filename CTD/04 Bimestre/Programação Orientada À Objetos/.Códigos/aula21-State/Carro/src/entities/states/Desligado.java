package entities.states;

import entities.Carro;
import entities.EstadoCarro;

public class Desligado implements EstadoCarro {

    private Carro v;

    public Desligado(Carro v) {
        this.v = v;
    }

    @Override
    public void ligar() {
        if (v.getCombustivelAtual() > 0) {
            v.setEstadoAtual(new Parado(v));
            System.out.println("O veículo se encontra ligado e parado.");
            v.setVelocidadeAtual(0);
        } else {
            v.setEstadoAtual(new SemGasolina(v));
            System.out.println("O veículo está sem gasolina.");
        }
    }

    @Override
    public void acelerar() {
        System.out.println("O veículo está desligado.");
    }

    @Override
    public void freiar() {
        System.out.println("O veículo está desligado.");
    }
}
