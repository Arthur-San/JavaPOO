package HerancaEPolimorfismo.Exercicios.ex03;

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
