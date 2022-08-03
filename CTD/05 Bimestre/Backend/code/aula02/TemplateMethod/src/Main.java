import entities.Contratado;
import entities.Efetivo;
import entities.Funcionario;

public class Main {
    public static void main(String[] args) {

        Funcionario efetivo = new Efetivo("Diego", "Reis", "01062080-2", 3000.0, 1000.0, 500.0);

        Funcionario contratado = new Contratado("Emanoela", "Reis", "01045000-2", 60.0, 50);

        efetivo.pagamentoSalario();
        contratado.pagamentoSalario();
    }
}
