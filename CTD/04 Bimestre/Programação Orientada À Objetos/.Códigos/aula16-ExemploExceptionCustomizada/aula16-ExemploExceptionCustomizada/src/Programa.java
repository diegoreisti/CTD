import entities.Cliente;
import entities.exceptions.ClienteException;

public class Programa {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Micheli", "Pinheiro", "321", 500.0);

        try {
            c1.depositar(500.0);
            System.out.println("Depositando R$500.00 ...");
            c1.comprar(300);
            System.out.println("Comprando ítem de R$300.00 ...");
            c1.contrairDivida(2000.0);
            System.out.println("Contraindo a dívida de R$2000.00 ...");
            System.out.println("Saldo atual : " + c1.getSaldoEmConta());
            System.out.println("Dívida atual: " + c1.getDivida());
        }
        catch (ClienteException e) {
            System.err.println(e);
        }
        finally {
            System.out.println("Programa finalizado");
        }

    }

}
