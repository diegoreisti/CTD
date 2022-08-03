import entities.Circulo;
import entities.Quadrado;

public class Program {
    public static void main(String[] args) {

        Circulo c = new Circulo(4);

        double perimetroCirculo = c.calcularPerimetro();

        Quadrado q = new Quadrado(8);

        double perimetroQuadrado = q.calcularPerimetro();

        //System.out.println(perimetroQuadrado);
    }
}
