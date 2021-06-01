package hwlesson15.task3;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Car extends Thread{

    /* class fields */
    private int carNumber;
    private String model;
    private Semaphore parkingPlaces;

    /* constructor */
    public Car(int carNumber, String model, Semaphore parkingPlaces){
        this.carNumber = carNumber;
        this.model = model;
        this.parkingPlaces = parkingPlaces;
        this.start();
    }

    /* getters & setters */
    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Semaphore getParkingPlaces() {
        return parkingPlaces;
    }

    public void setParkingPlaces(Semaphore parkingPlaces) {
        this.parkingPlaces = parkingPlaces;
    }

    /* methods */
    public void run(){
        try {
            System.out.println("The car # " + this.carNumber + " is finding parking ...");
            this.parkingPlaces.acquire();
            TimeUnit.MILLISECONDS.sleep(1500);
            System.out.println("The car " + this.carNumber + " has parked!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.parkingPlaces.release();
        }
    }
}//class ends
