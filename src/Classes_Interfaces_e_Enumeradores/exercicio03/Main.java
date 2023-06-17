package Classes_Interfaces_e_Enumeradores.exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Esporte esporte = Esporte.FUTEBOL;
//        System.out.println(esporte.getTipoEsporte() );
//
        System.out.println("Escolha um esporte: ");

        Esporte[] arrayEsportes = Esporte.values();
        for (Esporte es : arrayEsportes) {
            System.out.println(es.ordinal() + " " + es.getTipoEsporte());
        }
        System.out.print("->");

        int option = sc.nextInt();
        switch (option){
            case 0:
                Esporte esporte = Esporte.FUTEBOL;
                System.out.println(esporte.getTipoEsporte() );
                break;
            case 1:
                Esporte esporte = Esporte.BASQUETE;
                System.out.println(esporte.getTipoEsporte() );
                break;
            case 2:
                Esporte esporte = Esporte.NATACAO;
                System.out.println(esporte.getTipoEsporte() );
                break;
            case 3:
                Esporte esporte = Esporte.JIUJITSU;
                System.out.println(esporte.getTipoEsporte() );
                break;
            case 4:
                Esporte esporte = Esporte.VOLEI;
                System.out.println(esporte.getTipoEsporte() );
                break;
            case 5:
                Esporte esporte = Esporte.CROSSFIT;
                System.out.println(esporte.getTipoEsporte() );
                break;
        }


    }
}
