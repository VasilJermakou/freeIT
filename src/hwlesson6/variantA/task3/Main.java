package hwlesson6.variantA.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Вывести заданное количество случайных чисел с переходом
         * и без перехода на новую строку.
         * */

        System.out.println("****************************************");
        Scanner scanner = new Scanner(System.in);

        System.out.print(">>Enter value of numbers that you want to enter: ");
        String stringValue = scanner.next();
        int value = Integer.parseInt(stringValue);
        while (value <= 0){
            System.out.println("<<Value should be a positive number!");
            System.out.print(">>Please, enter positive number: ");
            stringValue = scanner.next();
            value = Integer.parseInt(stringValue);
        }

        //System.out.println("You enter " + value);
        int[] numbers = new int[value];

        for (int i = 0; i < numbers.length; i++){
            System.out.print(">>Enter " + (i + 1) + " value: ");
            stringValue = scanner.next();
            value = Integer.parseInt(stringValue);
            numbers[i] = value;
        }

        System.out.println("");
        Main.printArray(numbers);
        scanner.close();
        System.out.println("\n****************************************");


    }//main ends

    /* static methods */
    public static void printArray(int[] array){
        System.out.println("Print array with new line:");
        for(int i : array)
            System.out.println(i);

        System.out.println("Print array in one line:");
        for(int i : array)
            System.out.print(i + " ");
    }
}//class ends
