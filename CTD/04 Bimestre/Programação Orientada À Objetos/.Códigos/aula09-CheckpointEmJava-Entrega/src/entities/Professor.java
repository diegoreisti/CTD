package entities;

import java.util.Arrays;
import java.util.Calendar;

public class Professor extends Funcionario {
    private Turma[] turmasEnsinando;

    public Professor() {
    }

    public Professor(int id, String nome, String sobreNome, char sexo, Calendar dataNascimento, String cpf, int numeroCracha, Calendar dataAdmissao, double salario, boolean snMestrado, boolean snDoutorado, Turma[] turmasEnsinando) {
        super(id, nome, sobreNome, sexo, dataNascimento, cpf, numeroCracha, dataAdmissao, salario, snMestrado, snDoutorado);
        this.turmasEnsinando = turmasEnsinando;
    }

    public Turma[] getTurmasEnsinando() {
        return turmasEnsinando;
    }

    public void setTurmasEnsinando(Turma[] turmasEnsinando) {
        this.turmasEnsinando = turmasEnsinando;
    }

    public void ensinarTurma(String turma){
        System.out.printf("O professor %s, cracha %d iniciou a aula na turma %s \n",this.getNome(), this.getNumeroCracha(), turma);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Professor{" +
                "turmasEnsinando=" + Arrays.toString(turmasEnsinando) +
                '}';
    }
}
