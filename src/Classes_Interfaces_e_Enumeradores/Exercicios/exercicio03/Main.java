package Classes_Interfaces_e_Enumeradores.Exercicios.exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer option;
        do {
            System.out.println("Escolha um esporte: ");

            Esporte[] arrayEsportes = Esporte.values();
            for (Esporte es : arrayEsportes) {
                System.out.println(es.ordinal() + " " + es.getTipoEsporte());
            }
            System.out.println("6 Sair");
            System.out.print("->");

            option = sc.nextInt();

            if (option == 6){
                break;
            }

            Esporte esporte = Esporte.values()[option];

            switch (option) {
                case 0:
                    System.out.println(esporte + " É TETRAAAAA\n");
                    break;
                case 1:
                    System.out.println(esporte + " só pra quem é alto\n");
                    break;
                case 2:
                    System.out.println(esporte + " Não tem bola\n");
                    break;
                case 3:
                    System.out.println(esporte + " Não tem bola\n");
                    break;
                case 4:
                    System.out.println(esporte + " OLHA O SAQUEEE\n");
                    break;
                case 5:
                    System.out.println(esporte + " coisa de maluco\n");
                    break;
            }


        } while (option <= 6);
        System.out.println("Programa encerrado!");

    }
}
