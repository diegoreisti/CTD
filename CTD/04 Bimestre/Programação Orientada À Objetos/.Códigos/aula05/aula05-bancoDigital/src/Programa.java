import entities.Cliente;

public class Programa {
    public static void main(String[] args) {

        Cliente cli0 = new Cliente();

        Cliente cli1 = new Cliente(001, "Arnold Schwarzenegger");

        cli1.setDivida(150000);

        System.out.println(cli0);
        System.out.println(cli1);
    }
}
