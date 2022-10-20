package entities;

public class RoboLeve extends SistemaArmas implements IVoam, IAtacarDefender {

    @Override
    public void defender() {
        System.out.println("Robô leve defendendo...");
    }

    @Override
    public void atacar() {
        System.out.println("Robô leve atacando...");
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrar robô leve!");
    }

    @Override
    public void voar() {
        System.out.println("Robo leve voando >>>");
    }
}
