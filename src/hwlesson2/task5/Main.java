package hwlesson2.task5;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        /**
         * 5.
         * Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
         * */

        int[] array ={1, 2, -3};
        Main.countPositiveAndNegativeNumbers(array);


    }//main ends

    /* static methods */
    public static void countPositiveAndNegativeNumbers(int[] array){
        int positiveNumber = 0;
        int negativeNumber = 0;
        int zeroNumber = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > 0)
                positiveNumber++;
            else if(array[i] < 0)
                negativeNumber++;
            else
                zeroNumber++;
        }
        System.out.println("Results:\npositive numbers " + positiveNumber + ", negative numbers " + negativeNumber + ", zero numbers " + zeroNumber + ".");
    }

}//class ends
