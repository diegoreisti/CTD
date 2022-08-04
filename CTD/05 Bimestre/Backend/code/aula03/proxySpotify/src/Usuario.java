public class Usuario {
    private int identificador;
    private String tipoUSer;

    public Usuario(int identificador, String tipoUSer) {
        this.identificador = identificador;
        this.tipoUSer = tipoUSer;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getTipoUSer() {
        return tipoUSer;
    }

    public void setTipoUSer(String tipoUSer) {
        this.tipoUSer = tipoUSer;
    }
}
