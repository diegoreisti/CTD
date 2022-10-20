package entities;

import java.time.Instant;
import java.time.LocalDate;

public class Cachorro {
    private int id;
    private String nome;
    private int anoNasc;
    private double peso;
    private boolean chip;
    private boolean ferido;

    public Cachorro() {
    }

    public Cachorro(int id, String nome, int anoNasc, double peso, boolean chip, boolean ferido) {
        this.id = id;
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.peso = peso;
        this.chip = chip;
        this.ferido = ferido;
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

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isChip() {
        return chip;
    }

    public void setChip(boolean chip) {
        this.chip = chip;
    }

    public boolean isFerido() {
        return ferido;
    }

    public void setFerido(boolean ferido) {
        this.ferido = ferido;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", anoNasc=" + anoNasc +
                ", peso=" + peso +
                ", chip=" + chip +
                ", ferido=" + ferido +
                '}';
    }

    public void buscarIdade(){
        LocalDate ld = LocalDate.now();
        System.out.println(ld.getYear() - this.anoNasc);
    }

    public void encaminharAdocao(){
        // peso > 5 e ferido não
        if (this.peso >5 && !this.ferido){
            System.out.printf("Cachorro %s PODE ser encaimnhado para adoção!", this.nome);
        } else {
            System.out.printf("Cachorro %s NÃO PODE ser encaimnhado para adoção!", this.nome);
        }
    }

}
