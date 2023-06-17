package Classes_Interfaces_e_Enumeradores.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();


        System.out.println("Informe a altura: ");
        retangulo.setAltura(sc.nextDouble() );

        System.out.println("informe a largura: ");
        retangulo.setLargura(sc.nextDouble() );

        retangulo.areaRetangulo();
        retangulo.perimetroRetangulo();

        System.out.println(retangulo);
        System.out.println("Altura e largura são iguais? " + retangulo.equals(retangulo) );
    }

}
