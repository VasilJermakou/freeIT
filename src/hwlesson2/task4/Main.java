package hwlesson2.task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /**
         * 4.
         * Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
         * */

        int[] array = {1, -2, 3};
        System.out.println(Main.countPositiveNumbers(array));

    }//main ends

    /*static methods*/
    public static int countPositiveNumbers(int[] array){
        int result = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > 0)
                result++;
        }
        return result;
    }

}//class ends
