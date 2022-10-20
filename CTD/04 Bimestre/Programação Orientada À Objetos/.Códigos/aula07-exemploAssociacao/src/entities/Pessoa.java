package entities;

public class Pessoa {
    private int id;
    private String nome;
    private Pet pet;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, Pet pet) {
        this.id = id;
        this.nome = nome;
        this.pet = pet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", pet=" + pet +
                '}';
    }
}
