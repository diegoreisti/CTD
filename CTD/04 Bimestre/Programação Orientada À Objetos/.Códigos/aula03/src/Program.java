import java.util.Scanner;

public class Program {

    public static int quantosPacotes(double qtd){

        double kilo = 0.0, peso = 0.0;
        int pac = 0;

        Scanner entrada = new Scanner(System.in);

        while (kilo < qtd) {
            System.out.print("Digite o peso do pacote: ");
            peso = entrada.nextDouble();
            kilo += peso;
            pac += 1;
        }

        entrada.close();

        return pac;

    }

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        String nomePet;
        double quantidadeRacao;
        int pacotes;

        System.out.print("Digite o nome do pet: ");
        nomePet = ler.nextLine();

        System.out.print("Digite a quantidade de ração/dia (KG)");
        quantidadeRacao = ler.nextDouble();

        pacotes = quantosPacotes(quantidadeRacao);

        System.out.printf("O pet %s precisará de %d pacotes.", nomePet, pacotes);

        ler.close();


    }
}
