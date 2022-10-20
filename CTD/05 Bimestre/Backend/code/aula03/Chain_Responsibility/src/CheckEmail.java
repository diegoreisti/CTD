public class CheckEmail {
    Gerenciador inicial;

    public CheckEmail() {
        this.inicial = new GerenciadorGerencia();
        Gerenciador tecnico = new GerenciadorTecnico();
        Gerenciador comercial = new GerenciadorComercial();
        Gerenciador spam = new GerenciadorSpam();

        inicial.setGerenciadorSeguinte(comercial);
        comercial.setGerenciadorSeguinte(tecnico);
        tecnico.setGerenciadorSeguinte(spam);
    }

    public void verificar(Email email){
        inicial.verificar(email);
    }
}
