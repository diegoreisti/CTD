import java.util.Scanner;

public class NumeroPrimo {

    static void verificaNumeroPrimo(int numeroVerificar){
        int divisivelZero = 0;
        for(int i=2; i < numeroVerificar; i++){
            if (numeroVerificar%i == 0){
                divisivelZero++;
            }
        }
        if (divisivelZero > 0){
            System.out.println("O número não é primo");
        } else {
            System.out.println("O número é primo");
        }
    }

    public static void main (String[] args){
        int numero;
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um número a ser verificado: ");
        numero = ler.nextInt();

        verificaNumeroPrimo(numero);

    }
}
