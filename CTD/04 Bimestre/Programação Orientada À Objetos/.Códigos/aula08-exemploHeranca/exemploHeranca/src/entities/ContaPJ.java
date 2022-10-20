package entities;

public class ContaPJ extends ContaCliente{
    private String cnpj;

    public ContaPJ() {
    }

    public ContaPJ(int id, int agencia, int numero, String nome, double saldo, double limite, String cnpj) {
        super(id, agencia, numero, nome, saldo, limite);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}
