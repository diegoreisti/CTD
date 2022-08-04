package entities;

import java.time.LocalDate;

public class CartaoCredito extends MeioPagamento {
    private double saldo;
    private double limite;

    public CartaoCredito(String numeroCartao, String CVV, LocalDate dataValidade, double saldo, double limite) {
        super(numeroCartao, CVV, dataValidade);
        this.saldo = saldo;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean autorizaPagamento(double valor) {
        return !(valor > (this.saldo + this.limite));
    }
}
