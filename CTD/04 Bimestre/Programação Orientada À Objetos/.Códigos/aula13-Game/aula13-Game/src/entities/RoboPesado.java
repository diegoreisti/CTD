package entities;

public class RoboPesado extends SistemaArmas implements IVoam, IAtacarDefender {

    @Override
    public void defender() {
        System.out.println("Robô pesado defendendo...");
    }

    @Override
    public void atacar() {
        System.out.println("Robô pesado atacando...");
    }

    @Override
    public void mostrar() {

        System.out.println("Mostrar robô pesado!");
    }

    @Override
    public void voar() {
        System.out.println("Robo pesado voando >>>");
    }
}
