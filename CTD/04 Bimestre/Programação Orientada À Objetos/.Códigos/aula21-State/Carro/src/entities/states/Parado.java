package entities.states;

import entities.Carro;
import entities.EstadoCarro;

public class Parado implements EstadoCarro {

    private Carro v;

    public Parado(Carro v) {
        this.v = v;
    }

    @Override
    public void ligar() {
        System.out.println("O veículo já está ligado.");
        System.out.println("Não insista, seu arranque irá estragar assim.");
    }

    public void desligar() {
        v.setEstadoAtual(new Desligado(v));
    }

    @Override
    public void acelerar() {
        if (v.getCombustivelAtual() > 0) {
            v.setEstadoAtual(new EmMovimento(v));
            System.out.println("O veículo está andando.");
            v.modificarVelocidade(20);
            v.modificarCombustivel(-1);
        } else {
            v.setEstadoAtual(new SemGasolina(v));
            System.out.println("O veículo está sem combustível.");
        }
    }

    @Override
    public void freiar() {
        System.out.println("O carro já está parado.");
    }
}
