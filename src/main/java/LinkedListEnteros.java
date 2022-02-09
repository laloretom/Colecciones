import java.util.LinkedList;
import java.util.Random;

public class LinkedListEnteros {

    public static void main(String[] args) {

        LinkedList<Integer> lista= new LinkedList<Integer>();
        Random random = new Random();

        while (lista.size() < 25) {
            int randomNumber = random.nextInt(100);
            lista.add(randomNumber);
        }
        System.out.println(lista);
    }
}
