import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro("First","Pastor Alemão", 3 , "Dir 1");
        Cachorro c2 = new Cachorro("Second","Labrador", 1 , "Dir 2");
        Cachorro c3 = new Cachorro("Third","Collie", 7 , "Dir 3");
        Cachorro c4 = new Cachorro("Fourth","Podle", 4 , "Dir 4");

        ArrayList<Cachorro> segunda = new ArrayList<>();
        ArrayList<Cachorro> terca = new ArrayList<>();
        ArrayList<Cachorro> quarta = new ArrayList<>();
        ArrayList<Cachorro> quinta = new ArrayList<>();
        ArrayList<Cachorro> sexta = new ArrayList<>();

        segunda.add(c1);
        segunda.add(c2);
        segunda.add(c4);

        terca.add(c1);
        terca.add(c3);
        terca.add(c4);

        quarta.add(c4);
        quarta.add(c1);

        quinta.add(c3);
        quinta.add(c4);

        sexta.add(c3);
        sexta.add(c2);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("cachorros.datas");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(segunda);
            objectOutputStream.writeObject(terca);
            objectOutputStream.writeObject(quarta);
            objectOutputStream.writeObject(quinta);
            objectOutputStream.writeObject(segunda);

            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("cachorros.datas");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            ArrayList<Cachorro> dias;

            for (int i = 0; i < 5; i++) {
                System.out.println("Dia: " + (i+1));
                System.out.println("======================");
                dias = (ArrayList<Cachorro>) objectInputStream.readObject();

                for (Cachorro c: dias) {
                    System.out.println(c);
                }
            }

            objectInputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
