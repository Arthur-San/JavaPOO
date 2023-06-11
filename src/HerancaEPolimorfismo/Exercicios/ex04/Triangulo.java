package HerancaEPolimorfismo.Exercicios.ex04;

public class Triangulo extends FiguraGeometrica{
    double altura;
    double largura;

    public Triangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public void calcularArea() {
        double area = (altura * largura) / 2;
        System.out.println("Área do triângulo: " + area);
    }
}
