package ConceitosBasicos.exercicios_01.ex_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal cachorro = new Animal();

        System.out.println("qual som o cachorro faz?");
        cachorro.som = sc.nextLine();

        Animal gato = new Animal();

        System.out.println("qual som o gato faz?");
        gato.som = sc.nextLine();

        Animal passaro = new Animal();

        System.out.println("qual som o passaro faz?");
        passaro.som = sc.nextLine();


        System.out.println("o cahorro faz: "+ cachorro.emitirSom(cachorro.som));
        System.out.println("o gato faz: " + gato.emitirSom(gato.som));
        System.out.println("o passaro faz: " + passaro.emitirSom(passaro.som));


    }
}
