import entities.ImpressoraCannon;
import entities.ImpressoraEpson;

import java.time.LocalDate;

public class Programa {
    public static void main(String[] args) {
        ImpressoraEpson ep1 = new ImpressoraEpson("LX-300","USB", LocalDate.now(), 0, 10.0);

        ep1.imprimir();

        System.out.println(ep1);

        ep1.imprimir();

        System.out.println(ep1);

        ImpressoraCannon ep2 = new ImpressoraCannon("CN-4000", "USB", LocalDate.now(), 1, 5.0);

        ep2.imprimir();

        System.out.println(ep2);

        ep2.imprimir();

        System.out.println(ep2);
    }
}
