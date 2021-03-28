package hwlesson4.task5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /**
         * Создайте 2 массива из 5 случайных чиселиз отрезка [0 ; 15] каждый,
         * выведите массивы на экран в двух отдельных строках. Посчитайте среднее
         * арифмитическое элементов каждого массива и сообщите для какого из массивов
         * это значение оказалось больше (либо сообщите, что их средние арифмитические равны.
         * */

        int[] arrayOne = new int[5];
        int[] arrayTwo = new int[5];

        Main.fillArray(arrayOne, 15);
        Main.fillArray(arrayTwo, 15);

        //print
        hwlesson4.task4.Main.printArray(arrayOne);
        System.out.println("");
        hwlesson4.task4.Main.printArray(arrayTwo);

        double resultOne = Main.countArithmeticMean(arrayOne);
        double resultTwo = Main.countArithmeticMean(arrayTwo);

        String answer = (resultOne > resultTwo) ? "" + resultOne : (resultOne == resultTwo) ? "numbers equals" : "" + resultTwo;
        System.out.println("\n"  + answer);


    }//main ends

    /* static methods */
    //#1
    public static int[] fillArray(int[] array, int numBounds){
        Random random = new Random();

        for(int i = 0; i < array.length; i++)
            array[i] = random.nextInt(numBounds) + 1;

        return array;
    }

    //#2
    public static double countArithmeticMean(int [] array){
        double result = 0;

        if(array.length != 0){
            for(int i = 0; i < array.length; i++)
                result += array[i];
        }

        result /= array.length;
        return result;
    }

}//class ends
