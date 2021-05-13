package hwlesson16.task2;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        /**
         * Задать массив строк. Используя средства Stream API
         * отсортировать строки в лексикографическом порядке по возрастанию и убыванию.
         * */

        //create String array
        String[] cities = {"Amsterdam","Minsk","Berlin","Madrid","Paris","Vilnius"};

        //create stream and sorted in lexical order
        Arrays.stream(cities).sorted( (a, b) -> a.compareTo(b)).forEach( (a)-> System.out.println(a));

        System.out.println(" ");

        //create stream and sorted in unlexical order
        Arrays.stream(cities).sorted(Collections.reverseOrder()).forEach((a)-> System.out.println(a));
    }
}
