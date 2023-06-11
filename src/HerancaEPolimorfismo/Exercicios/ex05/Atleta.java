package HerancaEPolimorfismo.Exercicios.ex05;

public class Atleta extends Pessoa{
    String esporte;

    public Atleta(String nome, int idade, String esporte) {
        super(nome, idade);
        this.esporte = esporte;
    }

    @Override
    public String toString() {
        return
                "nome: " + nome +
                "\nidade: " + idade +
                "\nesporte: " + esporte;
    }
}
