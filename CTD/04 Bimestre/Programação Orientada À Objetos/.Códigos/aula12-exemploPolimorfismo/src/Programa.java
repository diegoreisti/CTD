import entities.Empregado;
import entities.EmpregadoEstagiario;
import entities.EmpregadoTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); //Poder usar o . para o double
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o número de empregados da folha deste mês: ");
        int n = sc.nextInt();

        List<Empregado> minhaLista = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            System.out.println("Empregado #" + i);
            System.out.println("É terceirizado (s/n)? ");
            char ch = sc.next().charAt(0);
            System.out.println("É estagiário (s/n)?");
            char estag = sc.next().charAt(0);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Horas trabalhadas: ");
            int horasTrab = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();

            if(ch == 's'){
                System.out.print("Custo adicional:");
                double custoAdicional = sc.nextDouble();
                minhaLista.add(new EmpregadoTerceirizado(nome, horasTrab, valorHora, custoAdicional));
            } else if (estag == 's') {
                System.out.print("Auxílio Transporte:");
                double auxilioTransporte = sc.nextDouble();
                minhaLista.add(new EmpregadoEstagiario(nome, horasTrab, valorHora, auxilioTransporte));
            }
            else {
               minhaLista.add(new Empregado(nome, horasTrab, valorHora));
            }
        }

        /*for (Empregado emp : minhaLista){
            System.out.println(emp.getNome() + " - R$ " + emp.pagamento());
        }*/

        minhaLista.forEach(emp -> System.out.println(emp.getNome() + " - R$ " + emp.pagamento()));

    }
}
