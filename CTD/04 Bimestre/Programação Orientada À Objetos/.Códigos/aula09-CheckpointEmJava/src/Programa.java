import entities.Endereco;
import entities.subclasses.Marketing;

public class Programa {

    public static void main(String[] args) {

//        Endereco end1 = new Endereco(1, "Túlio Paiva", "215", "Porto Alegre", "RS");

//        Funcionario f1 = new Funcionario(1, "Paolo", "Santos", 654987, end1);
//
//        f1.trabalhar();
//        System.out.println(f1);

        Endereco end2 = new Endereco(2, "Canoas", "41", "Pelotas", "RS");
        Marketing m1 = new Marketing(2, "Maria", "Ribeiro", 521145, end2, "Redes Sociais");
        m1.trabalhar();
        System.out.println(m1);


    }

}
