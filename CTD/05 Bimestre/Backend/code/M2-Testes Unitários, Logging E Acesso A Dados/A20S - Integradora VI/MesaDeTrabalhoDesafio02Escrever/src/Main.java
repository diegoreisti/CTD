import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        Empresa emp = new Empresa("111222000133","Empresa ABC");
        Empresa emp2 = new Empresa("987654321","Empresa CDE");

        Funcionario f1 = new Funcionario("Diego","Reis", "1111",2000d);
        Funcionario f2 = new Funcionario("Duda","Dourado", "2222",3500d);
        Funcionario f3 = new Funcionario("Manu","Dourado", "3333",4000d);
        Funcionario f4 = new Funcionario("Zeze","de Camargo", "4444",50000d);
        Funcionario f5 = new Funcionario("Ivete","Sangalo", "5555",100000d);
        Funcionario f6 = new Funcionario("Geraldo","Azevedo", "6666",86000d);
        Funcionario f7 = new Funcionario("Zé","Ramalho", "7777",6800d);

        ArrayList<Funcionario> arrayFunc = new ArrayList<>();
        arrayFunc.add(f1);
        arrayFunc.add(f2);
        arrayFunc.add(f3);
        arrayFunc.add(f4);
        arrayFunc.add(f5);
        ArrayList<Funcionario> arrayFunc2 = new ArrayList<>();
        arrayFunc2.add(f6);
        arrayFunc2.add(f7);

        emp.setFuncionarios(arrayFunc);
        ArrayList<Funcionario> f = emp.funcionarios;

        emp2.setFuncionarios(arrayFunc2);
        ArrayList<Funcionario> fn = emp2.funcionarios;
        
        FileWriter arq = new FileWriter("func.txt");
        PrintWriter escreverArquivo = new PrintWriter(arq);

        for (Funcionario func: f) {
            escreverArquivo.printf("%s;%s;%s;%s;%s;%s%n",emp.getNome(), emp.getCnpj(), func.getNome(), func.getSobreNome(), func.getDocumento(), func.getSalario());
        }

        for (Funcionario func: fn) {
            escreverArquivo.printf("%s;%s;%s;%s;%s;%s%n",emp2.getNome(), emp2.getCnpj(), func.getNome(), func.getSobreNome(), func.getDocumento(), func.getSalario());
        }


        arq.close();

        System.out.println("\nArquivo gerado com sucesso!");

    }
}
