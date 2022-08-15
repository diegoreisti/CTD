import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    private int id;
    private String nome;
    private String sobrenome;
    private String endereco;
    private String RG;
    private Date dataCadastro;
    private String usuario;
    private String senha;

    public Paciente(String nome, String sobrenome, String endereco, String RG, Date dataCadastro, String usuario, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.RG = RG;
        this.dataCadastro = dataCadastro;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}

