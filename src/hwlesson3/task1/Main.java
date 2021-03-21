package hwlesson3.task1;

public class Main {
    public static void main(String[] args) {

        /**
         * 1.
         * Начав тренировки, спортсмен в первый день пробежал 10 км.
         * Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
         * Какой суммарный путь пробежит спортсмен за 7 дней?
         *
         * */

        System.out.println("===========================================");
        double distance = 10.0;
        double increaseCoefficient = 1.1;

        for(int i = 0; i < 7; i++)
            distance *= increaseCoefficient;

        System.out.printf("After 7 days pass distance is %.2f km.", distance);
        System.out.println("\n===========================================");

    }//main ends
}//class ends
