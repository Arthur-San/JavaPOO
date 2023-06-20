package Classes_Interfaces_e_Enumeradores.Exercicios.exercicio01;

public class Retangulo {
    private Double altura;
    private Double largura;


    public Retangulo() {
    }

    public Retangulo(Double altura, Double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public void areaRetangulo(){
        System.out.println("A área do retangulo é: " + (largura*altura) );
    }

    public void perimetroRetangulo(){
        System.out.println("Perimetro do retangulo é: " +
                2*(largura + altura) );
    }

    @Override
    public String toString() {
        return "Retangulo:\n" +
                "altura: " + altura +
                "\nlargura=" + largura;
    }
    @Override
    public boolean equals(Object obj) {
        Retangulo valorComparado = (Retangulo) obj;
        boolean comparacao = altura.equals(valorComparado.getLargura());

        return comparacao;
    }






}



