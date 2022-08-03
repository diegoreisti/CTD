package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {

    @Test
    public void valFuncPerimetro(){
        Quadrado q = new Quadrado(8);
        assertEquals(32, q.calcularPerimetro());
    }

}