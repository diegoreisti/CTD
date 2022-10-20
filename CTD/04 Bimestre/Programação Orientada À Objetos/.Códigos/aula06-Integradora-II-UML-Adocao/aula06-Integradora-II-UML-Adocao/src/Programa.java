import entities.Cachorro;

public class Programa {

    public static void main(String[] args) {

        Cachorro c1 = new Cachorro(001, "Puppy", 1986, 6, false, false );

        System.out.println(c1);

        c1.buscarIdade();

        c1.encaminharAdocao();

    }
}
