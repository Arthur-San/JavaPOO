package HerancaEPolimorfismo.Exercicios.ex01;

//        Crie uma classe abstrata chamada "Veiculo" com os atributos marca
//        e modelo. Defina um método abstrato chamado "acelerar()". Em seguida,
//        crie duas classes, "Carro" e "Moto", que herdem da classe "Veiculo" e
//        implementem o método "acelerar()" de maneiras diferentes.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Moto moto = new Moto();

        moto.acelerar();
    }
}
