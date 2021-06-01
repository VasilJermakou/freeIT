package hwlesson16.task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /**
         * Задать массив чисел. Используя средства Stream API
         * вывести на консоль нечетные значения.
         * */

        //create Integer array
        Integer[] nums = {1,2,3,4,5,6,7,8,9,10};

        //print only even  numbers
        Arrays.stream(nums).filter((a)-> a%2 == 0).forEach((a)-> System.out.println(a));
    }//main ends
}//class ends
