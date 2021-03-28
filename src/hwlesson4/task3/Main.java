package hwlesson4.task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /**
         * Создайте массив из 15 случайных целых чисел из отрезка [0 ; 99]. Выведите массив на экран.
         * Подсчитайте сколько в массиве чётных элементов и выведите это количество на экран на отдельной строке.
         * */

        int [] numbers = new int[15];

        Main.fillArray(numbers);

        Main.printIntArray(numbers);

        System.out.printf("Even numbers: " + Main.countEvenIntegers(numbers));


    }//main ends

    /* static methods */
    //#1
    public static int[] fillArray(int[] array){
        Random random = new Random();

        if(array.length > 0){
            for(int i = 0; i < array.length; i++)
                array[i] = random.nextInt(99);
        }
        return array;
    }

    //#2
    public static void printIntArray(int[] array){
        for(int i = 0; i < array.length; i++)
            System.out.println("[" + i + "]" + " = " + array[i]);
    }

    //#3
    public static int countEvenIntegers(int[] array){
        int result = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0)
                result++;
        }

        return  result;
    }

}//class ends
