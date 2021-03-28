package hwlesson4.task4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /**
         * Создайте массив из 20 случайных чисел из отрезка [0; 20].
         * Выведите массив на экран в строку. Замените каждый элемент с нечетным индексом
         * на ноль. Снова выведите массив на экран на отдельной строке.
         * */

        int[] array = new int[20];

        System.out.printf("Print empty array: \n");
        Main.printArray(array);

        Main.fillArray(array);
        System.out.println("");

        System.out.printf("Print array with random elements: \n");
        Main.printArray(array);

        System.out.println("\nPrint odd index element: ");
        Main.printOddIndexElement(array);

    }//main ends

    /* static methods */
    //#1
    public static int[] fillArray(int [] array){
        Random random = new Random(47);
        for(int i = 0; i < array.length; i++)
            array[i] = random.nextInt(20);

        return array;
    }

    //#2
    public static void printArray(int [] array){
        for(int i : array)
            System.out.print(i + " ");
    }

    //#3
    public static void printOddIndexElement(int[] array){
        for(int i = 0; i < array.length; i++){
            if(i % 2 != 0)
                System.out.print(array[i] + " ");
        }
    }
}//class ends
