public class Presidente extends AutoridadeGovernamental {
    @Override
    public void processarDocumento(int tipoDoc) {
        if(tipoDoc == 3){
            System.out.println("Estou encarregado do documento. Presidente");
        } else if (this.seguinteAutoridade != null) {
            this.seguinteAutoridade.processarDocumento(tipoDoc);
        }
    }
}
