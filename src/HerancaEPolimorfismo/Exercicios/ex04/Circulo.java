package HerancaEPolimorfismo.Exercicios.ex04;

public class Circulo extends FiguraGeometrica{

    final double pi = 3.14;
    double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = pi * (raio * raio);
        System.out.println("Área do círculo: " + area);
    }
}
