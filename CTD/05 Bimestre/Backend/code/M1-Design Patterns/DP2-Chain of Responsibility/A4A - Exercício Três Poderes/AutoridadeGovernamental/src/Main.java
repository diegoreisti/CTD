public class Main {
    public static void main(String[] args) {
        AutoridadeGovernamental autoridade = new Deputado().setSeguinteAutoridade(new Ministro().setSeguinteAutoridade(new Presidente()));

        autoridade.processarDocumento(3);
    }
}
