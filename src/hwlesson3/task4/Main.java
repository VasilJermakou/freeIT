package hwlesson3.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * 4.
         * Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
         * */

        System.out.println("===========================================");
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>Enter number: ");
        String stringNumber = scanner.next();
        System.out.println(">>Enter multiplicator: ");
        String stringMultiplicator = scanner.next();

        int number = Integer.parseInt(stringNumber);
        int multiplicator = Integer.parseInt(stringMultiplicator);
        int result = number;

        for(int i = 1; i < multiplicator; i++)
            result += number;

        System.out.println(number + " * " + multiplicator + " = " + result);
        System.out.println("===========================================");

    }//main ends
}//class ends
