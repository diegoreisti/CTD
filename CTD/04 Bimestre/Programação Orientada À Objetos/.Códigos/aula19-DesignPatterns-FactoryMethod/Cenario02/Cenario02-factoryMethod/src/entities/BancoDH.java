package entities;

public class BancoDH {

    private BoletoSimpleFactory boletoSimpleFactory;

    public BancoDH(BoletoSimpleFactory boletoSimpleFactory) {
        this.boletoSimpleFactory = boletoSimpleFactory;
    }

    public Boleto gerarBoleto(int vencimentoBoleto, double valor) throws Exception {

        Boleto boleto = this.boletoSimpleFactory.criarBoleto(vencimentoBoleto, valor);

        System.out.println("Valor do boleto gerado: " + valor);
        System.out.println("Valor do juro: " + boleto.calcularJuro());
        System.out.println("Valor do desconto: " + boleto.calcularDesconto());
        System.out.println("Valor da multa: " + boleto.calcularMulta());
        System.out.println("----------------------------------");

        return boleto;
    }

}
