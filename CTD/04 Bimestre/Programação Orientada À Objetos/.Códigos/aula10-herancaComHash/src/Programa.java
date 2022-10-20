import entities.Empregado;
import entities.Vendedor;

public class Programa {
    public static void main(String[] args) {

        /*Vendedor v1 = new Vendedor(1, "Marcia", "20111", 2200.0, 525.0);
        v1.setComissao(3);
        v1.setTotalVendas(25.0);

        System.out.println("Vendedor:");
        System.out.println(v1);*/

        System.out.println("\nInstancia do primeiro empregado:");
        Empregado emp1 = new Empregado(2, "Patrick", "10100", 1500.0, 220.0);
        System.out.println(emp1);

        System.out.println("\nInstancia do segundo empregado:");
        Empregado emp2 = new Empregado(2, "Patrick", "10100", 1500.0, 220.0);
        System.out.println(emp2);

        System.out.println("\nInstancia do terceiro empregado:");
        Empregado emp3 = new Empregado(4, "Camila", "21444", 3500.0, 420.0);
        System.out.println(emp3);

        // testando o objeto emp1 com emp2

        // utilizar quando não tiver sobrecarga na Classe Empregado
        if (emp1.equals(emp2)){
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Sao diferentes!");
        }


        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp3.hashCode());

    }
}
