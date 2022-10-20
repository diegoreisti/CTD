import java.util.Scanner;

public class MaiorDeTres {

    static void maiorDeTres(int a, int b, int c){
        int maior = 0;

        if (maior < a){
            maior = a;
        }

        if (maior < b){
            maior = b;
        }

        if (maior < c){
            maior = c;
        }

        System.out.println("The biggest number is " + maior);

    }

    public static void main (String[] args){

        int n1, n2, n3;

        Scanner ler = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        n1 = ler.nextInt();

        System.out.print("Enter the first number: ");
        n2 = ler.nextInt();

        System.out.print("Enter the first number: ");
        n3 = ler.nextInt();

        maiorDeTres(n1,n2,n3);

    }
}
