package hwlesson6.abstractClasses;

import java.util.Objects;

public class PassengerCar extends LandTransport{

    /* class fields */
    private CarBodyType type;
    private int numberOfPassengers;

    /* constructors */
    public PassengerCar(){
        super(120, 200, 1500, "Skoda", 4, 10);
        this.type = CarBodyType.SEDAN;
        this.numberOfPassengers = 4;
    }

    public PassengerCar(int horsePower, String model, CarBodyType type){
        super(horsePower, 200, 1500, model, 4, 10);
        this.type = type;
        this.numberOfPassengers = 4;
    }

    public PassengerCar(int horsePower, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption, CarBodyType type, int numberOfPassengers){
        super(horsePower, maxSpeed, weight, model, numberOfWheels, fuelConsumption);
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
    }

    /* getters */
    public CarBodyType getType() {
        return type;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    /* object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerCar that = (PassengerCar) o;
        return numberOfPassengers == that.numberOfPassengers && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, numberOfPassengers);
    }

    @Override
    public String toString() {
        return "PassengerCar: " +
                "horsePower=" + this.getHorsePower() +
                " maxSpeed=" + this.getMaxSpeed() + "km/h" +
                " weight=" + this.getWeight() + "kg" +
                " model=" + this.getModel() +
                " numberOfWheels=" + this.getNumberOfWheels() +
                " fuelConsumption=" + this.getFuelConsumption() + "liters/100km" +
                " type=" + type +
                " numberOfPassengers=" + numberOfPassengers;
    }

    /* methods */
    //#1
    public void printObjectCharacteristics(){
        System.out.println(this.toString() + "" + " capacity in kilowatts=" + super.convertHorsePowerToKilowattsCapacity());
    }

    //#2
    private double calculateFuelConsumption(double hoursInTripp){
        return (hoursInTripp * this.getMaxSpeed()) / this.getFuelConsumption();
    }

    //#3
    public void maxDistanceCovered(double hoursInTripp){
        double fuelSpend = this.calculateFuelConsumption(hoursInTripp);
        double maxDistanceCover = this.getMaxSpeed() * hoursInTripp;
        //System.out.println("Maximum distance covered in specified time " + hoursInTripp + " hours: " + maxDistanceCover);
        //System.out.println("Fuel consumption for the covered distance will be " + fuelSpend);

        System.out.print("During " + hoursInTripp + " hours, " + this.getModel() + " car moving at a maximum speed of " + this.getMaxSpeed());
        System.out.println(" km/h will consume " + fuelSpend + " litters of fuel");

    }

}//class ends
