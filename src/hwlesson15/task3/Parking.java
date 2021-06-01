package hwlesson15.task3;

import java.util.concurrent.Semaphore;

public class Parking {

    public static void main(String[] args) {

        /**
         * Task3
         * Автостоянка. Доступно несколько машиномест. На одном месте может
         * находиться только один автомобиль. Если все места заняты, то автомо-
         * биль не станет ждать больше определенного времени и уедет на другую
         * стоянку.
         * */

        Semaphore parkingPlaces = new Semaphore(2);

        Car car1 = new Car(1234, "FIAT", parkingPlaces);
        Car car2 = new Car(5678, "Ford", parkingPlaces);
        Car car3 = new Car(9876, "Honda", parkingPlaces);
        Car car4 = new Car(5432, "Peugeot", parkingPlaces);
        Car car5 = new Car(3573, "Skoda", parkingPlaces);

    }//main ends
}//class ends
