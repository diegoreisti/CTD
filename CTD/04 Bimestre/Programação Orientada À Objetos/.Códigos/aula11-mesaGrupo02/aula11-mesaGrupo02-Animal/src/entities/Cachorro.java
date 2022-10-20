package entities;

public class Cachorro extends Animal {

    public Cachorro() {
    }

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au Au");
    }

    @Override
    public void locomover() {
        System.out.println("Corre.. corre.. corre..");
    }

}
