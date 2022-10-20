public class BancoDH {

    public Boleto gerarBoleto(int vencimentoBoleto, double valor) throws Exception {

        Boleto boleto;

        switch (vencimentoBoleto) {
            case 10:
                boleto = new Boleto10d(valor);
                break;
            case 30:
                boleto = new Boleto30d(valor);
                break;
            case 60:
                boleto = new Boleto60d(valor);
                break;
            default:
                throw new Exception("Vencimento indisponível. Tente outra vez!");
        }

        System.out.println("Valor do boleto gerado: " + valor);
        System.out.println("Valor do juro: " + boleto.calcularJuro());
        System.out.println("Valor do desconto: " + boleto.calcularDesconto());
        System.out.println("Valor da multa: " + boleto.calcularMulta());
        System.out.println("----------------------------------");

        return boleto;
    }

}
