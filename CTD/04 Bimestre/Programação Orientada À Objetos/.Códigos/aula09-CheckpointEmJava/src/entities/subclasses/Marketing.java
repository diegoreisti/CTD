package entities.subclasses;

import entities.Endereco;
import entities.Funcionario;

public class Marketing extends Funcionario {

    private String area;

    public Marketing(int id, String nome, String sobrenome, int cpf, Endereco endereco, String area) {
        super(id, nome, sobrenome, cpf, endereco);
        this.area = area;
    }

    @Override
    public void trabalhar() {
        System.out.println("O(A) funcionário(a) " + getNome() + " do setor de Marketing está trabalhando em " + area + ".");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Marketing {" +
                "area='" + area + '\'' +
                '}';
    }
}
