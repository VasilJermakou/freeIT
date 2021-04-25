package hwlesson6.variantA.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Приветствовать любого пользователя при вводе
         * его имени через командную строку.
         * */

        Scanner scanner = new Scanner(System.in);
        String name = "";

        System.out.print(">>Enter your name, please: ");
        name = scanner.next();
        System.out.println("Hello, " + name + "!");

        scanner.close();

    }//main ends
}//class ends
