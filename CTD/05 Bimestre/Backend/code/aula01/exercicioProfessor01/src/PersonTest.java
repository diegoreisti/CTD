import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;

    @BeforeEach
    void doBefore(){
        p1 = new Person("Ivo", "Ganda", LocalDate.of(2016, 3, 23));
        p2 = new Person("Ana", "Musk", LocalDate.of(1966, 1, 03));
        p3 = new Person("Joe", "Morello", LocalDate.of(2010, 12, 04));
        p4 = new Person("Rob", "Johnson", LocalDate.of(1976, 10, 25));
        p5 = new Person("Ted", "Trujillo", LocalDate.of(2014, 5, 14));
        p6 = new Person("Robert", "Traids", LocalDate.of(2000, 3, 30));
        p7 = new Person("Renata", "Castro", LocalDate.of(2010, 1, 18));
        p8 = new Person("Murilo", "Bianch", LocalDate.of(2015, 7, 11));
        p9 = new Person("Candido", "Silveira", LocalDate.of(1975, 9, 01));
        p10 = new Person("Camila", "Porto", LocalDate.of(2014, 5, 25));

    }

    @Test
    void imprimirObjeto(){
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());
        System.out.println(p9.toString());
        System.out.println(p10.toString());

    }

    @Test
    void adicionarColecao(){
        p1.adicionarNomes(p1);
        p2.adicionarNomes(p2);
        p3.adicionarNomes(p3);
        p4.adicionarNomes(p4);
        p5.adicionarNomes(p5);
        p6.adicionarNomes(p6);
        p7.adicionarNomes(p7);
        p8.adicionarNomes(p8);
        p9.adicionarNomes(p9);
        p10.adicionarNomes(p10);

    }

}