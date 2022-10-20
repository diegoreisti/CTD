package entities;

public class Empregado {
    private int id;
    private String nome;
    private String arquivo;
    protected double salario; //protected para ser usado na classe filha Vendedor, se não só poderia ser acessado via GET
    protected double desconto; //protected para ser usado na classe filha Vendedor, se não só poderia ser acessado via GET

    public Empregado() {
    }

    public Empregado(int id, String nome, String arquivo, double salario, double desconto) {
        this.id = id;
        this.nome = nome;
        this.arquivo = arquivo;
        this.salario = salario;
        this.desconto = desconto;
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

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double calcularSalario(){
        return salario - desconto;
    }

    public double calcularSalario(double premio){
        return (salario + premio) - desconto;
    }

    @Override
    public boolean equals(Object obj){
        //verificar se obj é do tipo Empregado
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Empregado emp = (Empregado)obj;

        if (this.getId() == emp.getId() &&
            this.getArquivo() == emp.getArquivo() &&
            this.getDesconto() == emp.getDesconto() &&
            this.getSalario() == emp.getSalario() &&
            this.getArquivo() == emp.getArquivo() &&
            this.getNome() == emp.getNome()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", arquivo='" + arquivo + '\'' +
                ", salario=" + salario +
                ", desconto=" + desconto +
                '}';
    }
}
