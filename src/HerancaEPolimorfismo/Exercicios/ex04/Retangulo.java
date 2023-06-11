package HerancaEPolimorfismo.Exercicios.ex04;

public class Retangulo extends FiguraGeometrica{
    double base;
    double altura;


    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(){
        double area = base * altura;
        System.out.println("Área do retângulo: " + area);
    }

}
