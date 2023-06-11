package HerancaEPolimorfismo.Exercicios.ex02;

//        Crie uma classe chamada "Calculadora" com um método sobrecarregado
//        chamado "somar()". O método "somar()" deve receber dois inteiros e
//        retornar a soma deles. Crie outras versões do método "somar()" que
//        aceitem dois números decimais, uma lista de inteiros e uma lista de
//        números decimais como argumentos.
public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        System.out.printf("soma inteiros: %d" , calc.somar(10, 20) );
        System.out.println("\nsoma decimais: " + calc.somar(30, 40) );




    }
}
