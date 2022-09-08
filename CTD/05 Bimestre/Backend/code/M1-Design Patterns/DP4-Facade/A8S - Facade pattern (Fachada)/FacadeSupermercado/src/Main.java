public class Main {
    public static void main(String[] args) {
        Cartao cartao = new Cartao("13456798", "Star Bank");
        Produto produto = new Produto("Ervilhas", "Pacote");

        FacadeDesconto facadeDesconto = new FacadeDesconto();
        int desconto = facadeDesconto.calcularDesconto(cartao, produto, 15);
        System.out.println(desconto);
    }
}
