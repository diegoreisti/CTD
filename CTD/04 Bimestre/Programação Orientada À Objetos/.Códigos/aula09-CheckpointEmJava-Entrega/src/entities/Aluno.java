package entities;

import java.util.Calendar;

public class Aluno extends Pessoa {
    private int numeroMatricula;
    private Calendar dataMatricula;

    public Aluno() {
    }

    public Aluno(int id, String nome, String sobreNome, char sexo, Calendar dataNascimento, String cpf, int numeroMatricula, Calendar dataMatricula) {
        super(id, nome, sobreNome, sexo, dataNascimento, cpf);
        this.numeroMatricula = numeroMatricula;
        this.dataMatricula = dataMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Calendar getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Calendar dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public void estudar(){
        System.out.printf("O aluno %s, matricula %d iniciou os estudos \n",this.getNome(), this.getNumeroMatricula());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Aluno{" +
                "numeroMatricula=" + numeroMatricula +
                ", dataMatricula=" + dataMatricula +
                '}';
    }
}
