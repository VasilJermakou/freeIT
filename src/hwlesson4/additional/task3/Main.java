package hwlesson4.additional.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Найти среднее арифмитическое элементов массива,
         * превосходящих некоторое число С.
         *
         * ???
         * */

        int[] array = new int[10];
        hwlesson4.task5.Main.fillArray(array, 10);
        hwlesson4.task4.Main.printArray(array);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n>>Please, enter C number: ");
        int cNumber = scanner.nextInt();

        /* TYPE CODE HERE */



    }//main ends
}//class ends
