package entities;

import java.util.ArrayList;
import java.util.List;

public class ProdutoComposite implements IProduto {

    private int id;
    private String nome;
    private List<IProduto> produtosFilhos;

    public ProdutoComposite(int id, String nome) {
        this.id = id;
        this.nome = nome;
        produtosFilhos = new ArrayList<>();
    }

    public void addProduto(IProduto p) {
        produtosFilhos.add(p);
    }

    public void removerProduto(IProduto p) {
        produtosFilhos.remove(p);
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
        double total = 0;
        for (IProduto p : produtosFilhos) {
            total += p.retornaPreco();
        }
        return total;
    }
}
