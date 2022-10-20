import java.util.Scanner;

public class ExtraDesafio04 {

    public static void main(String[] args){

        // Variaveis
        String nomeDev = "Julieta";
        int horasTrabalhadas = 0, horaExcedente = 0;
        double salarioSemanal = 875.0, salario = 0.0, valorExcedente = 0.0;

        Scanner ler = new Scanner(System.in);

        // Pegando quantas horas o programador trabalhou na semana
        System.out.print("Informe a quantidade de horas trabalhadas na semana: ");
        horasTrabalhadas = ler.nextInt();

        double valorHoraTrabalhada = salarioSemanal / 40;

        if (horasTrabalhadas <= 40){
            salario = horasTrabalhadas * valorHoraTrabalhada;
        } else {
            horaExcedente = horasTrabalhadas - 40;
            valorExcedente = horaExcedente * (valorHoraTrabalhada * 1.5);
            salario = salarioSemanal + valorExcedente;
        }

        System.out.printf("O dev %s trabalhou %d horas essa semana!. \n", nomeDev, horasTrabalhadas);
        if (horaExcedente > 0.0){
            System.out.printf("O total de horas extras foi de %dh (R$%f). Valor total da semana R$%f.", horaExcedente, valorExcedente, salario);
        } else {
            System.out.printf("Valor total da semana R$%f.", salario);
        }


    }

}


/*Crie um programa que possa relatar o salário semanal da programadora Julieta.
  Por motivos trabalhistas, ela pode trabalhar até 40 horas semanais, se trabalhar mais horas são consideradas
  horas extras, cujo valor é 50% a mais que a jornada normal de trabalho.
  Ela trabalhou na última semana um número "x" de horas e o valor por semana  é de 875.*/
