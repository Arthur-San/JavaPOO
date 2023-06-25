package Collections;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        //.add adiciona
        set.add("Maça");
        set.add("banana");

        //.remove remove
        set.remove("Maça");

        //verifica se contém
        boolean contem = set.contains("banana");

        //imprimir o Set
        System.out.println("Set atualizado" + set);

        //iterando sobre os elementos do set
        System.out.println("Elementos do Set");
        for (String elemento: set) {
            System.out.println(elemento);
        }

        //remover todos itens do set
        set.clear();




    }
}
