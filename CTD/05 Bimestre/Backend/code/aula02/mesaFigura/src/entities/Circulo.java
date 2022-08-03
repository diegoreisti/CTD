package entities;

public class Circulo extends Figura{
    private double diametro;

    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double calcularPerimetro() {
        double raio = this.diametro / 2;
        double PI = 3.14;
        return 2 * PI * raio;
    }
}
