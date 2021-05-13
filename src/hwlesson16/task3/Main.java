package hwlesson16.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /**
         * Задать массив строк. Используя средства Stream API
         * определить количество уникальных значений.
         * */

        //create String array
        String[] names = {"Vasil", "Maria", "Emily", "Julia", "Eduard", "Anna", "Sofia", "Vasil", "Maria", "Emily"};

        //print unique names
        Arrays.stream(names).distinct().forEach((a)-> System.out.println(a));
    }
}
