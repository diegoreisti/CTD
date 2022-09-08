package DentistClinic.clinic.model;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    private int id;
    private String nome;
    private String sobreNome;
    private LocalDate dataCadastro;
    private Endereco endereco;

    public Paciente(int id, String nome, String sobreNome, LocalDate dataCadastro, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
    }

    public Paciente(String nome, String sobreNome, LocalDate dataCadastro, Endereco endereco) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", dataCadastro=" + dataCadastro +
                ", endereco=" + endereco +
                '}';
    }
}
