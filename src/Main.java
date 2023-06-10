import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Bolo boloDeChocolate = new Bolo(); //instância da classe
        //new = instancia da classe.... OBJETO

        //atributos
        boloDeChocolate.nome = "Meu bolinho";
        boloDeChocolate.ingredientes = new String[]{ "nescau", "fermento", "ovos"  };
        boloDeChocolate.temperatura = 30;

        Bolo boloDeMorango = new Bolo();
        boloDeMorango.nome = "Meu moranguinho";
        boloDeMorango.ingredientes = new String[]{ "nesquik", "fermento", "ovos"  };


        //boloDeMorango.imprimirIngredientes();
//        System.out.println(boloDeMorango.temperatura);
//        boloDeMorango.assarBolo();
//        System.out.println(boloDeMorango.temperatura);
//        System.out.println(boloDeChocolate.temperatura);

        float valorDeVenda = boloDeChocolate.recuperarValorDeVendaDoBolo(10.5f, 1.15f);
        System.out.println(valorDeVenda);
    }
}