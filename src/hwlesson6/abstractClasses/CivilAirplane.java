package hwlesson6.abstractClasses;

import java.util.Objects;

public class CivilAirplane extends AirTransport{

    /* class fields */
    private int numberOfPassengers;
    private boolean isBusinessClass;

    /* constructors */
    public CivilAirplane(){
        super(45000, 1500, 30000, "Boeing", 65, 3000);
        this.numberOfPassengers = 250;
        this.isBusinessClass = true;
    }

    public CivilAirplane(int horsePower, String model, int numberOfPassengers, boolean isBusinessClass){
        super(horsePower, 1500, 30000, model, 65, 3000);
        this.numberOfPassengers = numberOfPassengers;
        this.isBusinessClass = isBusinessClass;
    }

    public CivilAirplane(int horsePower, int maxSpeed, int weight, String model, int wingSpan, int minRunwayLength, int numberOfPassengers, boolean isBusinessClass){
        super(horsePower, maxSpeed, weight, model, wingSpan, minRunwayLength);
        this.numberOfPassengers = numberOfPassengers;
        this.isBusinessClass = isBusinessClass;
    }

    /* getters */
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public boolean isBusinessClass() {
        return isBusinessClass;
    }

    /* object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CivilAirplane that = (CivilAirplane) o;
        return numberOfPassengers == that.numberOfPassengers && isBusinessClass == that.isBusinessClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfPassengers, isBusinessClass);
    }

    @Override
    public String toString() {
        return "CivilAirplane: " +
                " horsePower=" + this.getHorsePower() +
                " maxSpeed=" + this.getMaxSpeed() + "km/h" +
                " weight=" + this.getWeight() + "kg" +
                " model=" + this.getModel() +
                " wingSpan=" + this.getWingSpan() + "m" +
                " minRunwayLength=" + this.getMinRunwayLength() + "m" +
                " numberOfPassengers=" + numberOfPassengers +
                " isBusinessClass=" + isBusinessClass;
    }

    /* methods */
    //#1
    public void printObjectCharacteristics(){
        System.out.println(this.toString() + "" + " capacity in kilowatts=" + super.convertHorsePowerToKilowattsCapacity());
    }

    //#2
    public void civilAirplaneLoading(int loadPassengers){
        if(loadPassengers < 0)
            System.out.println("Incorrect argument: enter positive number of passengers!");
        else if(loadPassengers == 0)
            System.out.println("You have not loaded nobody!");
        else if(loadPassengers > this.numberOfPassengers)
            System.out.println("You need a bigger plane");
        else
            System.out.println("Plane loaded");
    }

}//class ends







