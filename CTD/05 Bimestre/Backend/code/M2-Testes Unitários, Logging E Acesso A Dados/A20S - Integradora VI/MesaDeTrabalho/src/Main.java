import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Empresa emp = new Empresa("111222000133","Empresa ABC");

        Funcionario f1 = new Funcionario("Diego","Reis", "1111",2000d);
        Funcionario f2 = new Funcionario("Duda","Dourado", "2222",3500d);
        Funcionario f3 = new Funcionario("Manu","Dourado", "3333",4000d);
        Funcionario f4 = new Funcionario("Zeze","de Camargo", "4444",50000d);

        ArrayList<Funcionario> arrayFunc = new ArrayList<>();
        arrayFunc.add(f1);
        arrayFunc.add(f2);
        arrayFunc.add(f3);
        arrayFunc.add(f4);

        emp.setFuncionarios(arrayFunc);
        
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Empregados.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            
            objectOutputStream.writeObject(emp);
            
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Empresa empresa = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("Empregados.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            empresa = (Empresa) objectInputStream.readObject();
            ArrayList<Funcionario> func = empresa.funcionarios;


            for (Funcionario f: func) {
                System.out.println("\nEmpresa: "+ empresa.getNome()+", CNPJ: "+ empresa.getCnpj() +", Funcionário: "+f.getNome()+" "+f.getSobreNome()+", Doc: "+f.getDocumento()+", Salário: "+f.getSalario());
            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

//        for (Funcionario c: emp.funcionarios) {
//            System.out.println(c.getNome());
//        }

    }
}
