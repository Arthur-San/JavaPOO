package Classes_Interfaces_e_Enumeradores;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Bolo bolo = new Bolo();
        bolo.nome = "Meu bolo";

        Bolo bolo2 = new Bolo();
        bolo2.nome = "Meu bolo";

        //System.out.println(bolo.equals(bolo2) );
        //de padrão retorna false, porque a refenencia de bolo é diferente de bolo2
        //após sobrescrever o método equals para comparar NOME ao invés de referência, retorna true caso sejam iguais

        System.out.println(bolo);
        System.out.println(bolo2);
    }
}