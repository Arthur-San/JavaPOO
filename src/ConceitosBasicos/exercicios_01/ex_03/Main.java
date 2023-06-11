package ConceitosBasicos.exercicios_01.ex_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario gerente = new Funcionario();
        Funcionario desenvolvedor = new Funcionario();

        System.out.println("informe o salário gerente: ");
        gerente.salario = sc.nextDouble();

        System.out.println("informe o salário desenvolvedor: ");
        desenvolvedor.salario = sc.nextDouble();

        System.out.println("salário bruto gerente: " + gerente.salario);
        gerente.calcularSalario(10, 15);
        System.out.println("salário líquido gerente: " + gerente.salario);

        System.out.println("\nsalário bruto desenvolvedor: " + desenvolvedor.salario);
        desenvolvedor.calcularSalario(0, 10);
        System.out.println("salário líquido desenvolvedor: " + desenvolvedor.salario);
    }
}
