public class Main {
    public static void main(String[] args) {
        CheckEmail checkEmail = new CheckEmail();
        checkEmail.verificar(new Email("email@email.com","tecnica@dh.com", "Reclamação"));
        checkEmail.verificar(new Email("email@email.com","batata@dh.com", "Gerencia"));
        checkEmail.verificar(new Email("email@email.com","pamonha@dh.com", "Comercial"));
        checkEmail.verificar(new Email("email@email.com","tecnica@colmeia.com", "Reclamação"));
    }
}
