import java.util.ArrayList;

public class LojaRoupas {

    private static final ArrayList<Pedido> pedidos = new ArrayList<>();

    public void fazerPedido(Tamanho tamanho, TipoRoupa tipoRoupa, boolean eNova, boolean eImportada, String cliente){
        pedidos.add(Pedido.of(tamanho, tipoRoupa, eNova, eImportada, cliente));
    }

    public static int getNumeroDePedidos(){
        return pedidos.size();
    }


}
