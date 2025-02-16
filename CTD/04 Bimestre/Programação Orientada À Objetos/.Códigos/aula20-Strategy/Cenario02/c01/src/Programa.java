import entities.Pedido;
import entities.PedidoBazar;
import entities.PedidoEletro;

public class Programa {

    public static void main(String[] args) {

        Pedido pe = new PedidoEletro(1000.0);
        System.out.println("Pedido - ELETRO:");
        System.out.println("Frete comum: R$" + pe.calcFreteComum());
        System.out.println("Frete expresso: R$" + pe.calcFreteExpresso());

        Pedido pb = new PedidoBazar(1000.0);
        System.out.println("Pedido - BAZAR:");
        System.out.println("Frete comum: R$" + pb.calcFreteComum());
        System.out.println("Frete expresso: R$" + pb.calcFreteExpresso());

    }

}
