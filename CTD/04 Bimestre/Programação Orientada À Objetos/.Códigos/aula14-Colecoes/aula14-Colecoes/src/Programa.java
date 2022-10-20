import java.util.*;

public class Programa {
    public static void main(String[] args) {

        List nossaLista = new ArrayList();

        nossaLista.add("Felipe");
        nossaLista.add("Diego");
        nossaLista.add("Duda");
        nossaLista.add("Manu");
        nossaLista.add("Rocha");
        nossaLista.add("Lia");

        System.out.println("Tamanho da lista: " + nossaLista.size());

        System.out.println("\nPercorrendo a lista com o FOR");
        for (int i = 0; i < nossaLista.size(); i++) {
            System.out.println(nossaLista.get(i));
        }

        System.out.println("\nPercorrendo a lista com o ITERATOR");
        Iterator it = nossaLista.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\nPercorrendo a lista com o FOR EACH");
        for (Object obj : nossaLista) {
            System.out.println(obj);
        }


       // O HashMap trabalha com <chave, valor>
        Map mapa = new HashMap();
        mapa.put(132,"Super Mario");
        mapa.put(345,"Luigi");
        mapa.put(656,"Bowser");
        mapa.put(624,"Yoshi");
        mapa.put(768,"Princesa Peach");
        mapa.put(444,"Toad");

        System.out.println("\nBusca pela chave 132");
        System.out.println(mapa.get(132));

        System.out.println("\nPercorrendo o HashMap com o FOR EACH");
        for (Object obj : mapa.values()) {
            System.out.println(obj);
        }

    }
}
