import java.util.Scanner;

public class Aula02_Variaveis {
    public static void main(String[] args){
        /*Defina dois números inteiros e atribua um valor a cada um. Verifique se o primeiro  número é divisível pelo segundo e indique o resultado obtido por meio de uma mensagem.*/

        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o primeiro número inteiro: ");
        int primeiroNumero = ler.nextInt();

        System.out.print("Informe o segundo número inteiro: ");
        int segundoNumero = ler.nextInt();

        if (primeiroNumero%segundoNumero == 0){
            System.out.printf("O número %d é divisível por %d",primeiroNumero,segundoNumero);
        } else {
            System.out.printf("O número %d não é divisível por %d",primeiroNumero,segundoNumero);
        }

    }
}
