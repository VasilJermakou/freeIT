package hwlesson6.abstractClasses;

import java.util.Objects;

public abstract class LandTransport extends Transport{

    /* class fields */
    private int numberOfWheels;
    private double fuelConsumption;

    /* constructor */
    public LandTransport(int horsePower, int maxSpeed, int weight, String model, int numberOfWheels, double fuelConsumption){
        super(horsePower, maxSpeed, weight, model);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    /* getters */
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    /* object methods */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LandTransport that = (LandTransport) o;
        return numberOfWheels == that.numberOfWheels && Double.compare(that.fuelConsumption, fuelConsumption) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfWheels, fuelConsumption);
    }

    @Override
    public String toString() {
        return "LandTransport{" +
                "numberOfWheels=" + numberOfWheels +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

}//class ends
