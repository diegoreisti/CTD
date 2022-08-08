public class Deputado extends AutoridadeGovernamental {
    @Override
    public void processarDocumento(int tipoDoc) {
        if(tipoDoc == 1){
            System.out.println("Estou encarregado do documento. Deputado");
        } else if (this.seguinteAutoridade != null) {
            this.seguinteAutoridade.processarDocumento(tipoDoc);
        }
    }
}
