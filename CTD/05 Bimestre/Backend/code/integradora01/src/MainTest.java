import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    Funcionario func1, func2;
    Afiliado afi1, afi2, afi3;
    Estagiario est1, est2;

    @BeforeEach
    public void doBefore() {
        func1 = new Funcionario("Pedro", 2);
        func1.vender(2);

        func2 = new Funcionario("Maria",1);
        func2.vender(1);

        afi1 = new Afiliado("Ramon");
        afi1.vender(4);

        afi2 = new Afiliado("Paulo");
        afi2.vender(1);

        afi3 = new Afiliado("José");

        func1.addAfiliado(afi1);

        est1 = new Estagiario("Mônica");
        est1.vender(10);

        est2 = new Estagiario("Pedro");
        est2.vender(2);

    }

    @Test
    public void mostrarVendedores() {
        System.out.println(func1.mostrarCategoria(func1));
        System.out.println(func2.mostrarCategoria(func2));
        System.out.println(afi1.mostrarCategoria(afi1));
        System.out.println(afi2.mostrarCategoria(afi2));
        System.out.println(afi3.mostrarCategoria(afi3));
        System.out.println(est1.mostrarCategoria(est1));
        System.out.println(est2.mostrarCategoria(est2));

        assertEquals("O vendedor Pedro tem 30 pontos e está na categoria aprendiz",func1.mostrarCategoria(func1));
        assertEquals("O vendedor Maria tem 10 pontos e está na categoria novato",func2.mostrarCategoria(func2));
        assertEquals("O vendedor Ramon tem 60 pontos e está na categoria mestre",afi1.mostrarCategoria(afi1));
        assertEquals("O vendedor Paulo tem 15 pontos e está na categoria novato",afi2.mostrarCategoria(afi2));
        assertEquals("O vendedor José tem 0 pontos e está na categoria novato",afi3.mostrarCategoria(afi3));
        assertEquals("O vendedor Mônica tem 50 pontos e está na categoria estagiário experiente",est1.mostrarCategoria(est1));
        assertEquals("O vendedor Pedro tem 10 pontos e está na categoria estagiário novato",est2.mostrarCategoria(est2));

    }

}