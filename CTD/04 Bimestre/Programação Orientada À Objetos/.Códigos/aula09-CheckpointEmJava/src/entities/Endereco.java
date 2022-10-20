package entities;

public class Endereco {

    private int id;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;

    public Endereco() {
    }

    public Endereco(int id, String rua, String numero, String cidade, String estado) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
