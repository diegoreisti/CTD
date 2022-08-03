package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    public void valFuncPerimetro(){
        Circulo c = new Circulo(4);
        assertEquals(12.56, c.calcularPerimetro());
    }

}