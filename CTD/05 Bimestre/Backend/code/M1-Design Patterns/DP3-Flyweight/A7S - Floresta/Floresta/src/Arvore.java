public class Arvore {
    private int altura;
    private int largura;
    private String cor;
    private String tipo;
    private int contador;

    public Arvore(int altura, int largura, String cor, String tipo) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
        this.tipo = tipo;
        this.contador = 1;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "Arvore{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", cor='" + cor + '\'' +
                ", tipo='" + tipo + '\'' +
                ", contador=" + contador +
                '}';
    }
}
