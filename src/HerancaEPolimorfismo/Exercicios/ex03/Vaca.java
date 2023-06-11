package HerancaEPolimorfismo.Exercicios.ex03;

public class Vaca extends Animal{

    public Vaca(String nome){
        super(nome);
    }

    public void emitirSom(){
        System.out.println("A vaca " + nome + " faz Muuuu");
    }
}
