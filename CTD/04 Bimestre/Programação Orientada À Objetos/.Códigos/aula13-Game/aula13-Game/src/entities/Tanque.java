package entities;

public class Tanque extends SistemaArmas {

    public void defender() {
        System.out.println("tanque defendendo...");
    }

    public void atacar() {
        System.out.println("Tanque atacando...");
    }

    @Override
    public void mostrar() {

        System.out.println("Mostrar tanque!");
    }
}
