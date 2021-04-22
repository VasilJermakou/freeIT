package hwlesson11.additional.task4;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {

    /* class fields */
    String model;
    int maxSpeed;
    int price;

    /* static field */
    public static final long serialVersionUID = 1;

    /* constructors */
    public Car(){
        this.model = "No model";
        this.maxSpeed = 180;
        this.price = 8000;
    }

    public Car(String model, int maxSpeed, int price){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    /* getters & setters */

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /* object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && price == car.price && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}//class ends
