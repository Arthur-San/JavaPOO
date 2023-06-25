package Collections;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //chave = String, valor = Integer

        //.add adiciona
        map.put("Arthur", 2);
        map.put("Fernanda", 4);
        map.put("Diana", 6);

        //imprimir map atualizado
        System.out.println("Map: " + map);

        //obtendo o valor associado a uma chave
        //int quantidadeBananas = map.get("Banana");
        //System.out.println("Quantidade de Bananas: " + quantidadeBananas);

        //verificando se uma chave está presente no Map
        boolean contemLaranja = map.containsKey("Laranja");
        System.out.println("O map contém a chave 'Laranja' ?" + contemLaranja);

        //removendo uma par, chave/valor do Map
        map.remove("Maça");

        //imprimir map atualizado
        System.out.println("Map: " + map);

        //iterando sobre as chaves do map
        System.out.println("Chaves do Map: ");
        for (String chave: map.keySet() ) {
            System.out.println(chave);
        }

        //iterando sobre os valores do map
        System.out.println("Chaves do Map: ");
        for (int valor: map.values() ) {
            System.out.println(valor);
        }

        //verificando se map está vazio
        System.out.println("Map está vazio? "  + map.isEmpty() );

        //verificando tamanho do map
        System.out.println("Tamanho do Map: " + map.size() );



    }
}
