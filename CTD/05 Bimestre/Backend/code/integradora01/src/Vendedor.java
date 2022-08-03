
//validação que usa propriedades de subclasse apenas!!
//Classe abstrata Vendedor - aqui vai o Template Method
public abstract class Vendedor {

    protected String nome;
    protected int vendas = 0;
    protected int PONTOS_POR_VENDA;
    protected String categoria = "novato";

    public void vender(int qtdVendas){
        this.vendas += qtdVendas;
        System.out.println(this.nome +" realizou "+ qtdVendas + " vendas.");
    }

    /*Método que calcula os pontos do Vendedor de acordo com seus aspectos
    a serem considerados*/
    public abstract int calcularPontos();

    /*TEMPLATE METHOD - recebe o total de pontos calculados a partir
    da subclasse e valida cada item para retornar a categoria*/
    public String mostrarCategoria(Vendedor v){
        int totalPontos = v.calcularPontos();
        if (totalPontos < 20) {
            v.categoria = "novato";
        } else if (totalPontos < 31) {
            v.categoria = "aprendiz";
        } else if (totalPontos < 41) {
            v.categoria = "bom";
        } else {
            v.categoria = "mestre";
        }

        return "O vendedor " + this.nome + " tem " + totalPontos + " pontos e está na categoria " + this.categoria;
    }
}





