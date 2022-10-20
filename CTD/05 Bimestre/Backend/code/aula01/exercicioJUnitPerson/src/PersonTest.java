import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void seNomeCompletoCorreto(){

                Person pessoa = new Person("Diego",
                        "Reis",
                        "eu@gmail.com",
                        LocalDate.of(1986, 9, 10));

        assertEquals(pessoa.getSobrenome() + ", " + pessoa.getNome(), pessoa.nomeCompleto());
        assertTrue(pessoa.maiorDeIdade());

    }

}