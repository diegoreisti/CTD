import java.util.HashMap;
import java.util.Map;

public class FlyweightRoupas {

    private Map<String, Roupa> roupaMap = new HashMap<>();

    public Roupa obterRoupa(String tamanho, String tipo, boolean eNova, boolean importada){
        Roupa roupa = roupaMap.get(tamanho);
        if(roupa==null){
            roupa = new Roupa(tamanho, tipo, eNova, importada);
            roupaMap.put(tamanho,roupa);
        }
        return roupa;
    }

    public Map<String, Roupa> getRoupaMap(){
        return roupaMap;
    }

}
