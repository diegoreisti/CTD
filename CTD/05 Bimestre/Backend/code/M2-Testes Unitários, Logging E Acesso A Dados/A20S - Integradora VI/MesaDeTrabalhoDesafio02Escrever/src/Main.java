import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        Empresa emp = new Empresa("111222000133","Empresa ABC");

        Funcionario f1 = new Funcionario("Diego","Reis", "1111",2000d);
        Funcionario f2 = new Funcionario("Duda","Dourado", "2222",3500d);
        Funcionario f3 = new Funcionario("Manu","Dourado", "3333",4000d);
        Funcionario f4 = new Funcionario("Zeze","de Camargo", "4444",50000d);
        Funcionario f5 = new Funcionario("Ivete","Sangalo", "5555",100000d);

        ArrayList<Funcionario> arrayFunc = new ArrayList<>();
        arrayFunc.add(f1);
        arrayFunc.add(f2);
        arrayFunc.add(f3);
        arrayFunc.add(f4);
        arrayFunc.add(f5);

        emp.setFuncionarios(arrayFunc);
        ArrayList<Funcionario> f = emp.funcionarios;
        
        FileWriter arq = new FileWriter("func.txt");
        PrintWriter escreverArquivo = new PrintWriter(arq);

        for (Funcionario func: f) {
            escreverArquivo.printf("%s;%s;%s;%s;%s;%s%n",emp.getNome(), emp.getCnpj(), func.getNome(), func.getSobreNome(), func.getDocumento(), func.getSalario());
        }

        arq.close();

        System.out.println("\nArquivo gerado com sucesso!");

    }
}
