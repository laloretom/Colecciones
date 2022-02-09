import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListEnteros {

    public static int sumaLista(LinkedList<Integer> lista)
    {
        int suma = 0;
        Iterator<Integer> iterator=lista.iterator();
        while(iterator.hasNext()){
            suma = suma + iterator.next();
        }
        return suma;
    }

    public static LinkedList<Integer> generaLista()
    {
        LinkedList<Integer> lista= new LinkedList<Integer>();
        Random random = new Random();
        while (lista.size() < 25) {
            int randomNumber = random.nextInt(100);
            lista.add(randomNumber);
        }
        Collections.sort(lista);
        return lista;
    }

    public static void main(String[] args) {

        LinkedList<Integer> Lista = generaLista();
        int suma = sumaLista(Lista);
        double promedio = suma/25;
        System.out.println(Lista);
        System.out.printf("Suma: %d Promedio: %f",suma,promedio);
    }
}
