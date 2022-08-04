package entities;

import java.time.LocalDate;

public class CartaoDebito extends MeioPagamento {
    private double saldo;

    public CartaoDebito(String numeroCartao, String CVV, LocalDate dataValidade, double saldo) {
        super(numeroCartao, CVV, dataValidade);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean autorizaPagamento(double valor) {
        return !(valor > this.saldo);
    }
}
