package POO.ClassesAbstratas;

public class CarroACombustao extends Carro{

    String tipoDeCombustivel;
    public void ligar() {
        System.out.println("Ligando o carro a combustão com o combustível " + tipoDeCombustivel);
    }
}
