package entities;

public class ProdRefrigerante implements IProduto {

    private int id;
    private String nome;
    private double preco;

    public ProdRefrigerante(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double retornaPreco() {
        return preco;
    }
}
