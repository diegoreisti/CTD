package entities;

public class Pet {
    private int id;
    private String raca;

    public Pet() {
    }

    public Pet(int id, String raca) {
        this.id = id;
        this.raca = raca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", raca='" + raca + '\'' +
                '}';
    }
}
