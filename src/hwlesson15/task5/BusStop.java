package hwlesson15.task5;

import java.util.concurrent.Semaphore;

public class BusStop {

    public static void main(String[] args) {

        /**
         * Task5
         * Автобусные остановки. На маршруте несколько остановок. На одной
         * остановке может останавливаться несколько автобусов одновременно,
         * но не более заданного числа.
         * */

        //not more than 2 buses on one buss stop.
        Semaphore bussStop = new Semaphore(2);

        //creating 6 buses
        Bus bus1 = new Bus(1, "Volvo", bussStop);
        Bus bus2 = new Bus(2, "Volvo", bussStop);
        Bus bus3 = new Bus(3, "Benz", bussStop);
        Bus bus4 = new Bus(4, "Benz", bussStop);
        Bus bus5 = new Bus(5, "MAN", bussStop);
        Bus bus6 = new Bus(6, "MAN", bussStop);

        //creating 6 threads
        Thread thread1 = new Thread(bus1);
        Thread thread2 = new Thread(bus2);
        Thread thread3 = new Thread(bus3);
        Thread thread4 = new Thread(bus4);
        Thread thread5 = new Thread(bus5);
        Thread thread6 = new Thread(bus6);

        //starting threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();

    }//class ends
}//class ends
