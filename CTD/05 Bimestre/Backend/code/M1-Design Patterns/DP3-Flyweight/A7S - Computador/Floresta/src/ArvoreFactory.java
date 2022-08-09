import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ArvoreFactory {

    private static Map<String, Arvore> arvoreMap = new HashMap<>();

    public Arvore getArvore(String tipo){

        System.out.println(tipo);

        if(arvoreMap.containsKey(tipo)){
            Arvore arvore = arvoreMap.get(tipo);
            arvore.setContador(arvore.getContador()+1);
            System.out.println("Arvore " + tipo + " plantada");
            return arvore;
        } else {
            if (Objects.equals(tipo, "ornamental")){
                arvoreMap.put(tipo, new Arvore(200, 400, "verde", tipo));
            } else if (Objects.equals(tipo, "frutifera")) {
                arvoreMap.put(tipo, new Arvore(500, 300, "vermelho", tipo));
            } else if (Objects.equals(tipo, "florifera")) {
                arvoreMap.put(tipo, new Arvore(100, 200, "azul", tipo));
            }
            System.out.println("Arvore " + tipo + " plantada");
            return arvoreMap.get(tipo);
        }
    }
}
