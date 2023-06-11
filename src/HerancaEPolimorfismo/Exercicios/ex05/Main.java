package HerancaEPolimorfismo.Exercicios.ex05;

//        Crie uma classe chamada "Pessoa" com atributos nome, idade e altura.
//        Defina um construtor padrão e um construtor que receba o nome e a
//        idade como parâmetros. Crie uma classe derivada de "Pessoa" chamada
//        "Atleta" com um atributo adicional chamado "esporte" e um construtor
//        que receba todos os atributos como parâmetros. Teste a criação de
//        objetos das classes "Pessoa" e "Atleta" e exiba suas informações.
public class Main {

    public static void main(String[] args) {


        Pessoa pe = new Pessoa("Arthur", 21);
        System.out.println(pe);

        System.out.println();

        Atleta at = new Atleta("Batman", 30, "luta");
        System.out.println(at);
    }

}
