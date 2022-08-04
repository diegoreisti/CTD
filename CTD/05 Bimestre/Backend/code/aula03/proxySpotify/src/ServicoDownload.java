public class ServicoDownload implements Download{
    @Override
    public void downloadMusica(Usuario usuario) {
        System.out.println("Usuário " + usuario.getIdentificador() + " pode baixar a música");
    }
}
