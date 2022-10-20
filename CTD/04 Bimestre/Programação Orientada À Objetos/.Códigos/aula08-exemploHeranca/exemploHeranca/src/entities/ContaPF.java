package entities;

public class ContaPF extends ContaCliente{
    private String cpf;

    public ContaPF() {
    }

    public ContaPF(int id, int agencia, int numero, String nome, double saldo, double limite, String cpf) {
        super(id, agencia, numero, nome, saldo, limite);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
