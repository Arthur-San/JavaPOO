import java.util.Date;

public class Bolo {

    String nome;
    float peso;
    String[] ingredientes;
    String[] modoDePreparo;
    float temperatura;
    Date dataDeValidade;




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


}
