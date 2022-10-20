import entities.Pessoa;
import entities.Pet;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(1, "Marta", new Pet(1, "Fila"));

        Pet pet2 = new Pet(2, "Poodle");
        Pessoa p2 = new Pessoa(2, "Pedro", pet2);

        System.out.println("Pessoa 01");
        System.out.println(p1);
        System.out.println("");
        System.out.println("Pessoa 02");
        System.out.println(p2);
    }
}
