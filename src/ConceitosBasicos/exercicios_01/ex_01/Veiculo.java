package ConceitosBasicos.exercicios_01.ex_01;

public class Veiculo {
    String modelo;
    String cor;
    int numeroDeRodas;
    double velocidade = 0.0;


    double acelerar(double velocidade){
       double velocidadeAtual = velocidade + 50.0;
        return velocidadeAtual;
    }

    double frear(double velocidade){
        double velocidadeAtual = velocidade - 25.0;
        return velocidadeAtual;
    }

    void imprimirAtributos(){
        System.out.printf("%s, %s , %d, %2.1f KM/h", modelo, cor, numeroDeRodas, velocidade);
    }


}
