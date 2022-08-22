import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro("Lara", 2);
        Cachorro c2 = new Cachorro("Tito", 5);
        Cachorro c3 = new Cachorro("Bulk", 4);
        Cachorro c4 = new Cachorro("Cretino", 3);

        ArrayList<Cachorro> listaCaes = new ArrayList<>();
        
        listaCaes.add(c1);
        listaCaes.add(c2);
        listaCaes.add(c3);
        listaCaes.add(c4);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("FileOutputCachorros.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(listaCaes);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Cachorro> listaCaesInput = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("FileOutputCachorros.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            listaCaesInput = (List<Cachorro>) objectInputStream.readObject();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Cachorro c: listaCaesInput) {
            System.out.println(c.getNome() + ": " + c.getIdade());

        }

    }
}
