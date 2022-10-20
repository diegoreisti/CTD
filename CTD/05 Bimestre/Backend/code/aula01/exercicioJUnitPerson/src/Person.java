import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Person {
    private String nome;
    private String sobrenome;
    private String email;
    //private int idade;
    private LocalDate dataNascimento;

    public Person(String nome, String sobrenome, String email, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        //this.idade = idade;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String nomeCompleto(){
        return this.sobrenome + ", " + this.nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }*/

    public LocalDate getdataNascimento() {
        return dataNascimento;
    }

    public void setdataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean maiorDeIdade(){
        return this.calcularIdade() >= 18;
    }

    public int calcularIdade(){
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

}
