// Vamos pensar em um sistema de validação de pagamentos, seja por cartão de crédito ou débito. Um cartão é composto por números na frente , um código de segurança e uma data de
// validade.
// Por sua vez, o cartão pode ser de crédito ou de débito.
// Se for de crédito, terá um campo para o limite e outro para o saldo utilizado.
// Se for de débito, terá um único campo para o saldo disponível.
// Para efetuar um pagamento com cartão, você precisa receber uma autorização. Se o cartão for de débito, a autorização ocorre se o saldo da conta em que o cartão é debitado for suficiente.
// No caso do cartão de crédito, ocorre se o limite não for ultrapassado.
//
// Atualmente, temos dois serviços chamados: ProcessadorCredito e ProcessadorDebito. Ambos possuem um método para processar o pagamento, mas primeiro, validamos se a data de vencimento
// é posterior à data atual. Essa lógica é comum, independentemente de o pagamento ser feito a débito ou a crédito, ou seja, temos um código que se repete nos dois métodos.
// Os métodos que utilizam os dois processadores de pagamento, recebem o cartão e o valor a ser cobrado.
// Gostaríamos de remover o código duplicado. Como você resolveria isso aplicando o Template Method pattern? Também gostaríamos de ver por console se o pagamento pode ser autorizado.
// Sendo assim, faça o diagrama UML e a implementação em JAVA.


package entities;

import java.time.LocalDate;

public abstract class MeioPagamento {
    protected String numeroCartao;
    protected String CVV;
    protected LocalDate dataValidade;

    public MeioPagamento(String numeroCartao, String CVV, LocalDate dataValidade) {
        this.numeroCartao = numeroCartao;
        this.CVV = CVV;
        this.dataValidade = dataValidade;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public abstract boolean autorizaPagamento(double valor);

    public void processarPagamento(MeioPagamento cartao, double valor){
        if (cartao.getDataValidade().isAfter(LocalDate.now()) ){
            if (cartao.autorizaPagamento(valor)){
                System.out.println("Pagamento realizado com sucesso!");
            }
        } else {
            System.out.println("Seu pagamento não pôde ser processado. Verifique seu saldo, limite ou contate a operadora.");
        }
    }
}
