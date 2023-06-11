package ConceitosBasicos.exercicios_01.ex_03;

public class Funcionario {
    String nome;
    double salario;

    void calcularSalario(double bonus, double desconto ){

        double v1 = this.salario * (bonus /= 100);
        double v2 = this.salario * (desconto /= 100);

        this.salario += v1;
        this.salario -= v2;

    }
}
