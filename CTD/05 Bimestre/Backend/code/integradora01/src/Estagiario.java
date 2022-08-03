public class Estagiario extends Vendedor{

    public Estagiario(String nome) {
        super.nome = nome;
        super.PONTOS_POR_VENDA = 5;
    }

    @Override
    public int calcularPontos() {
        return this.vendas * PONTOS_POR_VENDA;
    }

    @Override
    public String mostrarCategoria(Vendedor v){
        int totalPontos = v.calcularPontos();
        if (totalPontos < 50) {
            v.categoria = "estagiário novato";
        } else {
            v.categoria = "estagiário experiente";
        }

        return "O vendedor " + this.nome + " tem " + totalPontos + " pontos e está na categoria " + this.categoria;
    }
}
