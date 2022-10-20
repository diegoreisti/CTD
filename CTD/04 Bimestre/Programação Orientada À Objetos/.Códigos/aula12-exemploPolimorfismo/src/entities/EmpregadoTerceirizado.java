package entities;

public class EmpregadoTerceirizado extends Empregado{
    private double custoAdicional;

    public EmpregadoTerceirizado() {
        super();
    }

    public EmpregadoTerceirizado(String nome, int horasTrabalhadas, double valorHora, double custoAdicional) {
        super(nome, horasTrabalhadas, valorHora);
        this.custoAdicional = custoAdicional;
    }

    public double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + custoAdicional * 1.1;
    }
}
