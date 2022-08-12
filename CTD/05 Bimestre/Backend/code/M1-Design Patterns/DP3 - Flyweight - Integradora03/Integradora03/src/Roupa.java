public class Roupa {

    protected Tamanho tamanho;

    protected Roupa(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    protected TipoRoupa setTipoRoupa(TipoRoupa tipoRoupa){
        return tipoRoupa;
    }



}
