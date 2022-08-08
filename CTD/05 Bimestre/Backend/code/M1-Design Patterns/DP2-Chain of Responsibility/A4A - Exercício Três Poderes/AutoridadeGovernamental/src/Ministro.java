public class Ministro extends AutoridadeGovernamental {
    @Override
    public void processarDocumento(int tipoDoc) {
        if(tipoDoc == 2){
            System.out.println("Estou encarregado do documento. Ministro");
        } else if (this.seguinteAutoridade != null) {
            this.seguinteAutoridade.processarDocumento(tipoDoc);
        }
    }
}
