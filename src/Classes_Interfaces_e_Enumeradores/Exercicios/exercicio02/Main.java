package Classes_Interfaces_e_Enumeradores.Exercicios.exercicio02;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(1, "arthur", 1000.0);

        contaBancaria.sacar(100);
        contaBancaria.depositar(200);


    }
}
