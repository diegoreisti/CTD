import entities.Isca;
import entities.RoboLeve;
import entities.RoboPesado;

public class Programa {
    public static void main(String[] args) {
        RoboLeve rl1 = new RoboLeve();
        rl1.mostrar();
        rl1.atacar();
        rl1.defender();
        rl1.voar();

        RoboPesado rp1 = new RoboPesado();
        rp1.mostrar();
        rp1.atacar();
        rp1.defender();
        rp1.voar();

        Isca i1 = new Isca();
        i1.mostrar();
    }
}
