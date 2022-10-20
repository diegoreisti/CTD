package entities;

public class Preguica extends Animal{

    public Preguica() {
    }

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("... ... ...");
    }

    @Override
    public void locomover() {
        System.out.println("Puc... ... ... ... puc... .... ............. ZzzzZZZzzz");
    }
}
