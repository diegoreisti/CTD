import java.util.WeakHashMap;

public class FabricaDeRoupas {

    protected static WeakHashMap<Tamanho, Roupa> roupaMap = new WeakHashMap<Tamanho, Roupa>();

    public static Roupa fazerRoupa(Tamanho tamanho, TipoRoupa tipoRoupa, boolean eNova, boolean eImportada){
        Roupa roupa = roupaMap.get(tamanho);
        if (roupa == null){
            roupa = new Roupa(tamanho);
            roupaMap.put(tamanho, roupa);
        }
        System.out.printf("Fazendo um(a) '%s' tamanho '%s', Nova: '%B', Importada: '%B' \n", tamanho, tipoRoupa, eNova, eImportada);
        return roupa;
    }

    public static int getNumeroDeRoupas(){
        return roupaMap.size();
    }

}
