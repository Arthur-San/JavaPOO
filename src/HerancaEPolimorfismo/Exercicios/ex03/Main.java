package HerancaEPolimorfismo.Exercicios.ex03;

//        Crie uma classe chamada "Animal" com um construtor que receba o
//        nome do animal como parâmetro. Defina um método chamado "emitirSom()"
//        que imprime uma mensagem genérica. Crie classes derivadas de "Animal",
//        como "Cachorro", "Gato" e "Vaca", que sobrescrevam o método "emitirSom()"
//        para imprimir sons específicos para cada tipo de animal.

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Mits");
        gato.emitirSom();

        Cachorro cachorro = new Cachorro("Thor");
        cachorro.emitirSom();

        Vaca vaca = new Vaca("Boo");
        vaca.emitirSom();
    }
}
