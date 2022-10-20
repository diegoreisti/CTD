import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class Programa {
    public static void main(String[] args) {

        Cachorro c = new Cachorro("Toby", 5);
        System.out.println("Cachorro " + c.getNome() );
        c.emitirSom();
        c.locomover();

        Cavalo ca = new Cavalo("Queiroz", 15);
        System.out.println("\nCavalo " + c.getNome() );
        ca.emitirSom();
        ca.locomover();

        Preguica p = new Preguica("Bob", 26);
        System.out.println("\nPreguiça " + c.getNome() );
        p.emitirSom();
        p.locomover();
    }
}
