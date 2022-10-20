import java.util.Scanner;

public class NomeNascimento {

    public static void main(String[] args){

        String name, lastName, birthDay, birthMonth, birthYear;

        Scanner ler = new Scanner(System.in);

        System.out.print("Inform your first name: ");
        name = ler.next();

        System.out.print("Inform your last name: ");
        lastName = ler.next();

        System.out.print("Inform your birth day: ");
        birthDay = ler.next();

        System.out.print("Inform your birth month: ");
        birthMonth = ler.next();

        System.out.print("Inform your birth year: ");
        birthYear = ler.next();

        System.out.println("---------------");

        //first manner (one line)
        //System.out.printf("Hi " + name + " " + lastName + " (" + name.charAt(0)+lastName.charAt(0) + "), date of birth " + birthDay+"/"+birthMonth+"/"+birthYear);
        System.out.printf("Hi %s %s (%s%s), date of birth %s/%s/%s", name,lastName,name.charAt(0),lastName.charAt(0),birthDay,birthMonth,birthYear);
        System.out.println(" ");
        System.out.println("---------------");

    }
}
