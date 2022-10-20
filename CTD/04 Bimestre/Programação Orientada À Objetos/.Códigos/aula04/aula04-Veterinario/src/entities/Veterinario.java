package entities;

public class Veterinario {

    private int id;
    private String nome;
    private String sobreNome;
    private String registro;
    private double salario;

    // construtor padrão
    public Veterinario() {
    }

    // construtor com parâmetros


    public Veterinario(int id, String nome, String sobreNome, String registro, double salario) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.registro = registro;
        this.salario = salario;
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

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", registro='" + registro + '\'' +
                ", salario=" + salario +
                '}';
    }
}