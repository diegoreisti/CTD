public abstract class AutoridadeGovernamental {

    protected AutoridadeGovernamental seguinteAutoridade;
    public abstract void processarDocumento(int tipoDoc);

    public AutoridadeGovernamental setSeguinteAutoridade(AutoridadeGovernamental seguinteAutoridade){
        this.seguinteAutoridade = seguinteAutoridade;
        return this;
    }

}
