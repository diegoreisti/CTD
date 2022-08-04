public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario(1, "Free");
        Usuario u2 = new Usuario(2, "Premium");
        Download d1 = new ServicoDownloadProxy();
        d1.downloadMusica(u1);
        Download d2 = new ServicoDownloadProxy();
        d2.downloadMusica(u2);
    }
}
