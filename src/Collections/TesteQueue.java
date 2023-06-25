package Collections;


import java.util.LinkedList;
import java.util.Queue;

public class TesteQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        //.add adiciona
        queue.add("Arthur");
        queue.add("Fernanda");
        queue.add("Diana");

        //imprimir map atualizado
        System.out.println("Fila atualizada: " + queue);

       //obtendo e removendo o elemento da frente da fila
        System.out.println("removendo 1º elemento");
        String primeiroElemento = queue.poll();

        //imprimir map atualizado
        System.out.println("Fila atualizada: " + queue);

        //obtendo mas não removendo o elemento da frente da fila
        String elementoFrente = queue.peek();
        System.out.println("novo 1º elemento: " + elementoFrente);

        //verificando tamanho da fila
        System.out.println("Tamanho do fila: " + queue.size() );


        //verificando se map está vazio
        System.out.println("A Fila está vazia? "  + queue.isEmpty() );





    }
}
