package HerancaEPolimorfismo.Exercicios.ex04;

public class Main {
    public static void main(String[] args) {
        Triangulo tri = new Triangulo(10, 20);
        tri.calcularArea();

        Retangulo ret = new Retangulo(10,20);
        ret.calcularArea();

        Circulo cir = new Circulo(10);
        cir.calcularArea();
    }
}
