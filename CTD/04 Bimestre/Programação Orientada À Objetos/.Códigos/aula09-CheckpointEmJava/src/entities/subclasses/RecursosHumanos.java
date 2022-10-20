package entities.subclasses;

import entities.Endereco;
import entities.Funcionario;

public class RecursosHumanos extends Funcionario {

    private String metaAlcancada;

    public RecursosHumanos(int id, String nome, String sobrenome, int cpf, Endereco endereco, String metaAlcancada) {
        super(id, nome, sobrenome, cpf, endereco);
        this.metaAlcancada = metaAlcancada;
    }


}
