package HerancaEPolimorfismo.Exercicios.ex03;

import HerancaEPolimorfismo.Exercicios.ex02.Calculadora;

public class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);
    }

    public void emitirSom(){
        System.out.println("O cachorro " + nome + " Auau");
    }

}
