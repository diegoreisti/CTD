public class Main {
    public static void main(String[] args) {

        LojaRoupas loja = new LojaRoupas();

        loja.fazerPedido(Tamanho.M, TipoRoupa.BERMUDA, true, true, "LeBiscuit");
        loja.fazerPedido(Tamanho.M, TipoRoupa.BERMUDA, true, false, "LeBiscuit");
        loja.fazerPedido(Tamanho.M, TipoRoupa.BIKINI, true, false, "LeBiscuit");
        loja.fazerPedido(Tamanho.XS, TipoRoupa.CALCA, true, false, "Renner");
        loja.fazerPedido(Tamanho.S, TipoRoupa.BERMUDA, true, true, "Renner");
        loja.fazerPedido(Tamanho.S, TipoRoupa.BIKINI, true, false, "Renner");
        loja.fazerPedido(Tamanho.XS, TipoRoupa.SUNGA, false, true, "C&A");
        loja.fazerPedido(Tamanho.XS, TipoRoupa.SUNGA, true, true, "C&A");
        loja.fazerPedido(Tamanho.M, TipoRoupa.SUNGA, false, false, "C&A");

        System.out.println("Número de pedidos: " + LojaRoupas.getNumeroDePedidos());

        System.out.println("Número de objetos: " + FabricaDeRoupas.getNumeroDeRoupas());

    }
}
