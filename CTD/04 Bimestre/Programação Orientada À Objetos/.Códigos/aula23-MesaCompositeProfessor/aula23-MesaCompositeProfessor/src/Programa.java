import entities.Carrinho;
import entities.Combo;
import entities.Item;
import entities.Produto;

public class Programa {
    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();

        Item p1 = new Produto("Batata frita", 19.0);
        Item p2 = new Produto("X-salada", 22.0);
        Item p3 = new Produto("Refri 500ml", 12.0);

        Item combo = new Combo("Combo feliz");

        ((Combo)combo).inserirItem(p1); //Poderia ser simplesmente combo.sinserir item se tivesse criado o combo como Combo e não como Item (linha 15)
        ((Combo)combo).inserirItem(p2);
        ((Combo)combo).inserirItem(p3);

        carrinho.addItem(combo);
        carrinho.mostrarItens();
        System.out.println("Valor total: " + carrinho.valorTotal());
    }
}
