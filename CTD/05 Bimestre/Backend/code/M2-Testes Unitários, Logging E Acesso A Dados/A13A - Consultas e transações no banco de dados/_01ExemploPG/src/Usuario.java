public class Usuario {
    private int id;
    private String nome;
    private String email;
    private double saldo;

    public Usuario(String nome, String email, double saldo) {
        this.nome = nome;
        this.email = email;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSaldo() {
        return saldo;
    }

    public double aumentarSaldo(double valor) {
        this.saldo += saldo;
        return this.saldo;
    }
}
