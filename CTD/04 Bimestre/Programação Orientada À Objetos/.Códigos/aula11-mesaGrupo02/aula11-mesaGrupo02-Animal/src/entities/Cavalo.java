package entities;

public class Cavalo extends Animal{

    public Cavalo() {
    }

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Nnnhiiiiiii rê rê rê rê... brrrr!");
    }

    @Override
    public void locomover() {
        System.out.println("Pocotó.. pocotó.. pocotó..");
    }
}
