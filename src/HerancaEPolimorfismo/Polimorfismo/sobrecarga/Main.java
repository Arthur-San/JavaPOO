package HerancaEPolimorfismo.Polimorfismo.sobrecarga;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Bolo bolo = new Bolo();
        System.out.println(bolo.temperatura);
        bolo.assarBolo();
        System.out.println(bolo.temperatura);

        bolo.assarBolo(40);
        System.out.println(bolo.temperatura);

        bolo.assarBolo(40, 50);
        System.out.println(bolo.temperatura);

    }
}