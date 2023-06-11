package HerancaEPolimorfismo.Polimorfismo.sobrescrita;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Bolo bo = new Bolo();
        BoloComCoberturaDeChocolate bolo = new BoloComCoberturaDeChocolate();


        System.out.println("temperatura inicial: " + bolo.temperatura);
        System.out.println("Assando com a classe bolo");
        bo.assarBolo();
        System.out.println(bo.temperatura);

        System.out.println("Assando com a classe BoloComCoberturaDeChocolate");
        bolo.assarBolo();
        System.out.println(bolo.temperatura);

    }
}