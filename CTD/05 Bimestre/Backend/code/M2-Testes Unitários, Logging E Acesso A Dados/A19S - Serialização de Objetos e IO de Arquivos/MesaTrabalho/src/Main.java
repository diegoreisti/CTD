import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Contato c1 = new Contato("Diego", "7132156477", "diego@mail.com");
        Contato c2 = new Contato("Duda", "7132156478", "duda@mail.com");
        Contato c3 = new Contato("Manu", "7132156479", "manu@mail.com");

        ArrayList<Contato> contatosOut = new ArrayList<>();

        contatosOut.add(c1);
        contatosOut.add(c2);
        contatosOut.add(c3);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("contatos.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(contatosOut);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        ArrayList<Contato> contatosIn = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream("contatos.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            contatosIn = (ArrayList<Contato>) objectInputStream.readObject();

            for (Contato c: contatosIn) {
                System.out.printf("Nome: '%s', Email: '%s', Telefone: '%s' \n", c.getNome(), c.getEmail(), c.getTelefone());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {


        }


    }
}
