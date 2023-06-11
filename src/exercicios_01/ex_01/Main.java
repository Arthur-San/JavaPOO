package exercicios_01.ex_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Veiculo carro = new Veiculo();

        System.out.println("informe o modelo");
        carro.modelo = sc.nextLine();

        System.out.println("informe a cor");
        carro.cor = sc.nextLine();

        System.out.println("informe o numero de rodas");
        carro.numeroDeRodas = sc.nextInt();

        System.out.println("lIMITE DA VIA: 80KM/h !!!");

        System.out.println("informe a sua velocidade");
        carro.velocidade = sc.nextDouble();

        while (carro.velocidade != 80){
            if (carro.velocidade > 80){
                carro.velocidade = carro.frear(carro.velocidade);
                System.out.println("Freiando!!! Velocidade atual " + carro.velocidade);
            }
            else if (carro.velocidade < 60) {
                carro.velocidade = carro.acelerar(carro.velocidade);
                System.out.println("Acelerando!!! Velocidade atual " + carro.velocidade);
            }
            else if (carro.velocidade >= 60 && carro.velocidade < 80){
                System.out.println("velocidade ideal: " + carro.velocidade);
                break;
            }
        }

        carro.imprimirAtributos();




    }
}
