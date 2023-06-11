package HerancaEPolimorfismo.Construtor;

import java.util.Arrays;
import java.util.Date;

public class Bolo {

    String nome;
    float peso;
    String[] ingredientes;
    String[] modoDePreparo;
    float temperatura;
    Date dataDeValidade;

    public Bolo(){

    }

    public Bolo(String nome, float peso){
        this.nome = nome;
        this.peso = peso;
    }

    public Bolo(String nome, float peso, String[] ingredientes, int temperatura){
        this.nome = nome;
        this.peso = peso;
        this.ingredientes = ingredientes;
        this.temperatura = temperatura;
    }



    void imprimirIngredientes(){
        for (int i = 0; i <ingredientes.length; i++) {
            System.out.println(ingredientes[i]);
        }
    }

    void imprimirModoDePreparo(){
        for (int i = 0; i < modoDePreparo.length; i++) {
            System.out.println(modoDePreparo[i]);
        }
    }

    void prepararBolo(){
        System.out.println("você vai precisar de: ");
        imprimirIngredientes();

        System.out.println("Modo de preparo: ");
        imprimirModoDePreparo();
    }

    float recuperarValorDeVendaDoBolo(float precoDeCusto, float procentagemDeVenda){
        float valorPorBolo = precoDeCusto * procentagemDeVenda;
        return valorPorBolo;
    }

    void assarBolo() {
        temperatura += 10;
    }

    void assarBolo(int temp){
        temperatura += temp;
    }

    void assarBolo(int temp, int tempForma){
        temperatura += temp + tempForma;
    }


    @Override
    public String toString() {
        return "Bolo{" +
                "\nnome: " + nome
                +"\npeso: " + peso +
                "\ningredientes: " + Arrays.toString(ingredientes) +
                "\nmodoDePreparo: " + Arrays.toString(modoDePreparo) +
                "\ntemperatura: " + temperatura +
                "\ndataDeValidade: " + dataDeValidade +
                '}';
    }

}
