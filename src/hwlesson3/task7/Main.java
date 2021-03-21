package hwlesson3.task7;

public class Main {
    public static void main(String[] args) {

        /**
         * 7.
         * Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
         * */

        System.out.println("===========================================");

        int counter = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                counter += i;
                System.out.print(counter + " ");
            }
        }

        System.out.println("\nSumm of all odd numbers from 1 to 100: " + counter);

        System.out.println("===========================================");

    }//main ends
}//class ends
