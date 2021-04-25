package hwlesson6.abstractClasses;

import java.util.Objects;

public abstract class Transport {

    /* class fields */
    private int horsePower;
    private int maxSpeed;
    private int weight;
    private String model;

    /* constructor */
    public Transport(int horsePower, int maxSpeed, int weight, String model){
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.model= model;
    }

    /* getters */
    public int getHorsePower() {
        return horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    /* object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return horsePower == transport.horsePower && maxSpeed == transport.maxSpeed && weight == transport.weight && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horsePower, maxSpeed, weight, model);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", model='" + model + '\'' +
                '}';
    }

    /* methods */
    //#1
    protected double convertHorsePowerToKilowattsCapacity(){
        return this.getHorsePower() * 0.74;
    }

    //#2
    public void printObjectCharacteristics(){
        System.out.println(this.toString() + "" + " capacity in kilowatts=" + convertHorsePowerToKilowattsCapacity());
    }

}//class ends
