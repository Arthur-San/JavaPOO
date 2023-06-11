package HerancaEPolimorfismo.Exercicios.ex04;

//        Crie uma classe chamada "FiguraGeometrica" com um construtor que
//        receba o nome da figura como parâmetro. Defina um método abstrato
//        chamado "calcularArea()". Crie classes derivadas de "FiguraGeometrica",
//        como "Circulo", "Retangulo" e "Triangulo", que implementem o método
//        "calcularArea()" para calcular a área de cada figura.

public abstract class FiguraGeometrica {

    String nomeFigura;

    public abstract void calcularArea();


}
