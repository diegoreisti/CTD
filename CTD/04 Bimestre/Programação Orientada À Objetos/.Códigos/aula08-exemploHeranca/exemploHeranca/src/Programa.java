import entities.ContaPF;
import entities.ContaPJ;
import entities.ContaUniversitaria;

import java.util.Date;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

//        ContaCliente cc1 = new ContaCliente(0, 544, 6556, "Johnny Bubble", 0.0, 0.0 );

        ContaPF pf1 = new ContaPF(1, 3280, 51062, "Bob Dylan", 5000.0, 500.0, "01102232145");

        pf1.depositar(1000.00);
        pf1.sacar(800.00);

        System.out.println(pf1);

        ContaPJ pj1 = new ContaPJ(2, 3281, 51064, "Padaria Pedoca", 0.0, 500.0, "131531375000144");

        pj1.depositar(2000.00);
        pj1.sacar(1000.00);

        System.out.println(pj1);

        ContaUniversitaria univ1 = new ContaUniversitaria(3, 5544, 21745, "Nego Deto", 0.0, 0.0, "070552" );

        System.out.println(univ1);

        

    }

}
