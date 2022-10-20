package entities;

public class ContaUniversitaria extends ContaCliente{
    private String matricula;

    public ContaUniversitaria() {
    }

    public ContaUniversitaria(int id, int agencia, int numero, String nome, double saldo, double limite, String matricula) {
        super(id, agencia, numero, nome, saldo, limite);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
