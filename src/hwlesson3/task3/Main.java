package hwlesson3.task3;

public class Main {
    public static void main(String[] args) {

        /**
         * 3.
         * Вычислить: 1+2+4+8+...+256
         * */

        System.out.println("===========================================");

        int number = 1;
        int powOfTwo = 2;
        int lap = 1;

        while (powOfTwo <= 256){
            System.out.println("Number: " + number + ", pow: " + powOfTwo + ", lap: " + lap);
            number += powOfTwo;
            powOfTwo *= 2;
            lap++;
        }
        System.out.println("===========================================");
        System.out.println("Number: " + number + ", pow: " + powOfTwo + ", lap: " + lap);
        System.out.println("===========================================");

    }//main ends
}//class ends
