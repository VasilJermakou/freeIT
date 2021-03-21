package hwlesson3.task2;

public class Main {
    public static void main(String[] args) {

        /**
         * 2.
         * Одноклеточная амеба каждые 3 часа делится на 2 клетки.
         * Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
         * */

        System.out.println("===========================================");

        int ameba = 1;
        int reproductionCoefficient = 2;

        for(int i = 1; i < 25; i++){
            if(i % 3 == 0){
                ameba *= reproductionCoefficient;
                System.out.println("After " + i + " hours number of amebas: " + ameba);
            }
        }

        System.out.println("After 24 hours number of amebas: " + ameba);

        System.out.println("===========================================");

    }//main ends
}//class ends
