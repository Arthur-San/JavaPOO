package HerancaEPolimorfismo.Exercicios.ex05;

public class Pessoa {
    String nome;
    int idade;
    double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        if (altura == 0.0){
            return
                    "nome: " + nome +
                            "\nidade: " + idade;
        }else {
            return
                    "nome: " + nome +
                            "\nidade: " + idade +
                            "\naltura: " + altura;
        }
    }


}
