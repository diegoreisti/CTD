public class ServicoDownloadProxy implements Download{
    @Override
    public void downloadMusica(Usuario usuario) {
        if(usuario.getTipoUSer().equals("Premium")){
            ServicoDownload servicoDownload = new ServicoDownload();
            servicoDownload.downloadMusica(usuario);
            //System.out.println("Usuário ID " + usuario.getIdentificador() + " é Premium e pode baixar músicas");
        } else {
            System.out.println("Usuários Free não possuem permissão para baixar músicas!");
        }
    }
}
