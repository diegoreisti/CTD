public class Main {
    public static void main(String[] args) {

        ArvoreFactory arvoreFactory = new ArvoreFactory();

        Arvore o1 = arvoreFactory.getArvore("ornamental");
        System.out.println(o1.toString());
        Arvore f1 = arvoreFactory.getArvore("frutifera");
        System.out.println(f1.toString());
        Arvore o2 = arvoreFactory.getArvore("ornamental");
        System.out.println(o2.toString());
    }
}

