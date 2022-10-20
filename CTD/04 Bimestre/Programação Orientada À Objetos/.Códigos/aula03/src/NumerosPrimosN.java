import java.util.Arrays;
import java.util.Scanner;

public class NumerosPrimosN {

    static int searchPrimeNumbers(int numberToFind){
            int divisibleBy = 0;
            for(int i=2; i < numberToFind; i++){
                if (numberToFind%i == 0){
                    divisibleBy++;
                }
            }
            if (divisibleBy > 0){
                return -1;
            } else {
                return numberToFind;
            }
    }


    public static void main(String[] args){

        int qtdPrimeNumbers = 0, iterateNumber = 1, counter = 0;

        Scanner ler = new Scanner(System.in);
        System.out.print("How many prime numbers are we searching for?: ");
        qtdPrimeNumbers = ler.nextInt();

        int[] numbersFound = new int[qtdPrimeNumbers];

        do {
            iterateNumber++;
            if (searchPrimeNumbers(iterateNumber) != -1){
                numbersFound[counter] = iterateNumber;
                counter++;
            }
        } while (counter < qtdPrimeNumbers);


        System.out.println(Arrays.toString(numbersFound));


    }
}

/*Implemente um programa que nos permita exibir os primeiros "n" números primos
        pelo console, onde &quot;n&quot; é um valor numérico inserido pelo usuário. Por exemplo:
        Com n = 7, o que o programa deve retornar é "Os primeiros 7 números primos são:
        2, 3, 5, 7, 11, 13, 17"
*/