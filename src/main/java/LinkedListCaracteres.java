import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListCaracteres {

    public static LinkedList<Character> InvierteLista(LinkedList<Character> lista)
    {
        Collections.reverse(lista);
        return lista;
    }

    public static LinkedList<Character> generaLista()
    {
        LinkedList<Character> lista= new LinkedList<Character>();
        Random random = new Random();
        while (lista.size() < 10) {
            char caracter = (char) (random.nextInt(26) + 'a');
            lista.add(caracter);
        }
        return lista;
    }

    public static void main(String[] args) {

        LinkedList<Character> Lista = generaLista();
        System.out.println("Lista " + Lista);
        LinkedList<Character> ListaInvertida = InvierteLista(Lista);
        System.out.println("Lista invertida " + ListaInvertida);
    }

}

