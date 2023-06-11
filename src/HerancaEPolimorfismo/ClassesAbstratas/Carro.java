package HerancaEPolimorfismo.ClassesAbstratas;

public abstract class Carro {

    int velocidade;

    public abstract void ligar();

    public void imprimirVelocidade(){
        System.out.println(velocidade + " KM/h");
    }


}
