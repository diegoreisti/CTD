package entities;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Item> listaItens = new ArrayList<>();

    public void mostrarItens(){
        for (Item item : listaItens){
            System.out.println(item.getNome());
        }
    }

    public void addItem(Item item){
        listaItens.add(item);
    }

    public double valorTotal(){
        double valor = 0;
        for (Item item : listaItens){
            valor += item.calcularPreco();
        }
        return valor;
    }

}
