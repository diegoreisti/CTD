package entities.subclasses;

import entities.Endereco;
import entities.Funcionario;

public class Producao extends Funcionario {

    private int tempoExperiencia;

    public Producao(int id, String nome, String sobrenome, int cpf, Endereco endereco, int tempoExperiencia) {
        super(id, nome, sobrenome, cpf, endereco);
        this.tempoExperiencia = tempoExperiencia;
    }

}
