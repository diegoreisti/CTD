import entities.Produto;
import entities.IProduto;
import entities.ProdutoComposite;

public class Programa {
    public static void main(String[] args) {

        IProduto sanduiche = new Produto(1, "Big Cheese", 20.50);
        IProduto batatas = new Produto(2, "Batatas Fritas", 15.0);
        IProduto refri = new Produto(3, "Refri 500ML", 8.50);
        IProduto salada = new Produto(4, "Salada", 5.0);

        ProdutoComposite combo = new ProdutoComposite(1, "Lanche Completo");
        combo.addProduto(sanduiche);
        combo.addProduto(batatas);
        combo.addProduto(refri);
        combo.addProduto(salada);

        System.out.println(combo.retornaPreco());

    }
}
