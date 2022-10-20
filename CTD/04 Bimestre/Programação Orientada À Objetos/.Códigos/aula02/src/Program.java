import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // Declaring variables

        byte b1, b2;
        int sum, sub, div, times, mod;

        // Using Scanner class
        Scanner ler = new Scanner(System.in);

        System.out.print("Inform the first byte number: ");
        b1 = ler.nextByte();

        System.out.print("Inform the second byte number: ");
        b2 = ler.nextByte();

        System.out.println("--------------");

        System.out.println("First byte number: " + b1);
        System.out.println("Second byte number: " + b2);

        System.out.println("--------------");

        sum = b1 + b2;
        sub = b1 - b2;
        times = b1 * b2;
        div = b1 / b2;
        mod = b1 % 2;


        System.out.println("2 byte addition: " + sum);
        System.out.println("2 byte subtraction: " + sub);
        System.out.println("2 byte multiplication: " + times);
        System.out.println("2 byte division: " + div);
        System.out.println("2 byte module (remainder of division): " + mod);

        System.out.println("Adding one to the addition result with ++: " + ++sum);
        System.out.println("Decrementing one to the multiplication result with --: " + --times);



        // Good practice: clean the buffer after use

        ler.close();
    }

}