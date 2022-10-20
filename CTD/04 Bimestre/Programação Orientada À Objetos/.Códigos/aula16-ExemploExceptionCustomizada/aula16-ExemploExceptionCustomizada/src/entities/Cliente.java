package entities;

import entities.exceptions.ClienteException;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String rg;
    private double saldoEmConta;
    private double limite;
    private double divida;

    public Cliente(String nome, String sobrenome, String rg, double limite) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.saldoEmConta = 0.0;
        this.rg = rg;
        this.limite = limite;
        this.divida = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSaldoEmConta() {
        return saldoEmConta;
    }

    public double getLimite() {
        return limite;
    }

    public double getDivida() {
        return divida;
    }

    public void depositar(double valor) throws ClienteException {
        if (valor <= 0) {
            throw new ClienteException("Valor inválido para depósito.");
        } else {
            saldoEmConta += valor;
        }
    }

    public void comprar(double valor) throws ClienteException {
        if (saldoEmConta + limite < valor) {
            throw new ClienteException("Saldo insuficiente.");
        } else {
            saldoEmConta -= valor;
        }
    }

    public void contrairDivida(double valor) throws ClienteException {
        if (valor <= 0) {
            throw new ClienteException("Digite um valor acima de zero.");
        } else {
            divida += valor;
        }
    }

    public void pagarDivida(double valor) throws ClienteException {
        if (valor <= 0) {
            throw new ClienteException("Você não tem dívida.");
        } else {
            divida -= valor;
        }
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", saldoEmConta=" + saldoEmConta +
                '}';
    }
}

