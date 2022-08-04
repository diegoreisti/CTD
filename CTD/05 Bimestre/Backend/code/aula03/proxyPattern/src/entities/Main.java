package entities;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Diego", "Reis", "1254545588", new Date(), "Astrazeneca");
        Vacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(pessoa.getRg(), pessoa.getDataVacina(), pessoa.getNomeVacina());

    }
}
