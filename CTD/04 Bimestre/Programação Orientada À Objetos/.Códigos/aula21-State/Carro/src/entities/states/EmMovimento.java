package entities.states;

import entities.Carro;
import entities.EstadoCarro;
import jdk.swing.interop.SwingInterOpUtils;

public class EmMovimento implements EstadoCarro {

    private final int VELOCIDADEMAXIMA = 200;
    private Carro v;

    public EmMovimento(Carro v) {
        this.v = v;
    }

    @Override
    public void ligar() {
        System.out.println("Você não pode ligar/desligar o carro em movimento.");
    }

    @Override
    public void acelerar() {
        if (v.getCombustivelAtual() > 0) {

            if (v.getVelocidadeAtual() >= VELOCIDADEMAXIMA) {
                System.out.println("O carro está na velocidade máxina, reduza.");
                v.modificarVelocidade(-20);
                v.modificarCombustivel(-1);
            } else {
                v.modificarVelocidade(20);
                v.modificarCombustivel(-1);
            }

        } else {
            v.setEstadoAtual(new SemGasolina(v));
            System.out.println("O veículo está sem combustível.");
        }
    }

    @Override
    public void freiar() {
        v.modificarVelocidade(-20);
        if (v.getVelocidadeAtual() == 0) {
            v.setEstadoAtual(new Parado(v));
            System.out.println("O veículo está parado novamente.");
        }
    }
}
