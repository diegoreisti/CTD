package entities;

import java.time.LocalDate;

public abstract class Impressora {
    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private Integer folhasDisponiveis;
    protected double percTinta;

    public Impressora() {
    }

    public Impressora(String modelo, String tipoConexao, LocalDate dataFabricacao, Integer folhasDisponiveis, double percTinta) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
        this.percTinta = percTinta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Integer getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(Integer folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public double getPercTinta() {
        return percTinta;
    }

    public void setPercTinta(double percTinta) {
        this.percTinta = percTinta;
    }

    // METODOS

    public boolean temPapel(){
        return this.folhasDisponiveis > 0;
    }

    public boolean precisaTinta(){
        return this.percTinta == 0;
    }

    // Método abstrato, quem implementar esta classe terá que sobrescrever

    public abstract void imprimir();

    @Override
    public String toString() {
        return "Impressora{" +
                "modelo='" + modelo + '\'' +
                ", tipoConexao='" + tipoConexao + '\'' +
                ", dataFabricacao=" + dataFabricacao +
                ", folhasDisponiveis=" + folhasDisponiveis +
                ", percTinta=" + percTinta +
                '}';
    }
}
