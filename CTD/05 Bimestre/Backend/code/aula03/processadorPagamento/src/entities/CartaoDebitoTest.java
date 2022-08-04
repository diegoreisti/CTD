package entities;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CartaoDebitoTest {

    @Test
    public void validarCartoes(){
        CartaoDebito cd = new CartaoDebito("123456789", "321", LocalDate.of(2021, 10, 10), 500);
        assertTrue(cd.autorizaPagamento(500));
        assertFalse(cd.autorizaPagamento(501));
    }

}
