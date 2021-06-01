package hwlesson15.task5;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Bus implements Runnable{

    /* class fields */
    private int busRoutNumber;
    private String model;
    private Semaphore busStop;

    /* constructor */
    public Bus(int busRoutNumber, String model, Semaphore busStop){
        this.busRoutNumber = busRoutNumber;
        this.model = model;
        this.busStop = busStop;
        //this.run();
    }

    /* getters & setters */
    public int getBusRoutNumber() {
        return busRoutNumber;
    }

    public void setBusRoutNumber(int busRoutNumber) {
        this.busRoutNumber = busRoutNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Semaphore getBusStop(){
        return this.busStop;
    }

    public void setBusStop(Semaphore busStop){
        this.busStop = busStop;
    }

    /* object method */
    @Override
    public String toString() {
        return "Bus{" +
                "busRoutNumber=" + busRoutNumber +
                ", model='" + model + '\'' +
                '}';
    }

    /* method */
    @Override
    public void run() {
        try {
            System.out.println("The bus " + this.getBusRoutNumber() + " is waiting his turn ...");
            this.busStop.acquire();
            System.out.println("The bus " + this.getBusRoutNumber() + " is on the bus stop! Passengers can leave the bus ...");
            TimeUnit.MILLISECONDS.sleep(1500);
            System.out.println("The bus " + this.getBusRoutNumber() + " is leaving the bus stop");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            this.busStop.release();
        }
    }
}//class ends
