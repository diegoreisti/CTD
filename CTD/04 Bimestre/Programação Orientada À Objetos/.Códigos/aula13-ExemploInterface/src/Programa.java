import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Programa {
    public static void main(String[] args) {

        System.out.println("CONTA CORRENTE");
        ContaCorrente cr1 = new ContaCorrente(0.0, 1000.0);
        System.out.println("Saldo atual: " + cr1.informarSaldo());
        cr1.depositar(1600.0);
        cr1.sacar(1000.0, 10);
        System.out.println("Saldo atualizado: " + cr1.informarSaldo());

        System.out.println("\nCONTA POUPANÇA");
        ContaPoupanca cp1 = new ContaPoupanca(0.0);
        System.out.println("Saldo inicial R$ " + cp1.informarSaldo());
        cp1.depositar(2000.0);
        System.out.println("Saldo atualizado R$ " + cp1.informarSaldo());
        cp1.sacar(500.0);


    }
}
