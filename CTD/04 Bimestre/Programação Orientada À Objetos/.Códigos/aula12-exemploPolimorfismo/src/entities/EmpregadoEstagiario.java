package entities;

public class EmpregadoEstagiario extends Empregado{
    private double auxilioTransporte;

    public EmpregadoEstagiario() {
        super();
    }

    public EmpregadoEstagiario(String nome, int horasTrabalhadas, double valorHora, double auxilioTransporte) {
        super(nome, horasTrabalhadas, valorHora);
        this.auxilioTransporte = auxilioTransporte;
    }

    public double getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(double auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + auxilioTransporte;
    }
}
