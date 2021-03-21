package hwlesson3.task6;

public class Main {
    public static void main(String[] args) {

        /**
         * 6.
         * Напишите программу вывода всех четных чисел от 2 до 100 включительно
         * */

        System.out.println("===========================================");

        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println("\n===========================================");

    }//main ends
}//class ends
