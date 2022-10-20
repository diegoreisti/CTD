package entities;

import java.util.Calendar;

public class Funcionario extends Pessoa{
    private int numeroCracha;
    private Calendar dataAdmissao;
    private double salario;
    private boolean snMestrado;
    private boolean snDoutorado;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, String sobreNome, char sexo, Calendar dataNascimento, String cpf, int numeroCracha, Calendar dataAdmissao, double salario, boolean snMestrado, boolean snDoutorado) {
        super(id, nome, sobreNome, sexo, dataNascimento, cpf);
        this.numeroCracha = numeroCracha;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.snMestrado = snMestrado;
        this.snDoutorado = snDoutorado;
    }

    public int getNumeroCracha() {
        return numeroCracha;
    }

    public void setNumeroCracha(int numeroCracha) {
        this.numeroCracha = numeroCracha;
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean getSnMestrado() {
        return snMestrado;
    }

    public void setSnMestrado(boolean snMestrado) {
        this.snMestrado = snMestrado;
    }

    public boolean getSnDoutorado() {
        return snDoutorado;
    }

    public void setSnDoutorado(boolean snDoutorado) {
        this.snDoutorado = snDoutorado;
    }



    @Override
    public String toString() {
        return super.toString() +
                "Funcionario{" +
                "numeroCracha=" + numeroCracha +
                ", dataAdmissao=" + dataAdmissao +
                ", salario=" + salario +
                ", snMestrado=" + snMestrado +
                ", snDoutorado=" + snDoutorado +
                '}';
    }
}
