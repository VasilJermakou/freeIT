package hwlesson6.abstractClasses;

import java.util.Objects;

public class CargoCar extends LandTransport {

    /* class fields */
    private int liftingCapacity;

    /* constructors */
    public CargoCar(){
        super(415, 150, 7500, "DAF", 6, 16);
        this.liftingCapacity = 15000;
    }

    public CargoCar(int horsePower, String model, int liftingCapacity){
        super(horsePower, 150, 7500, model, 6, 16);
        this.liftingCapacity = liftingCapacity;
    }

    public CargoCar(int horsePower, int maxSpeed, int weight, String model, int numberOfWheels, int fuelConsumption, int liftingCapacity){
        super(horsePower, maxSpeed, weight, model, numberOfWheels,fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    /* getters */
    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    /* object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoCar cargoCar = (CargoCar) o;
        return liftingCapacity == cargoCar.liftingCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), liftingCapacity);
    }

    @Override
    public String toString() {
        return "CargoCar: " +
                "horsePower=" + this.getHorsePower() +
                " maxSpeed=" + this.getMaxSpeed() + "km/h" +
                " weight=" + this.getWeight() + "kg" +
                " model=" + this.getModel() +
                " numberOfWheels=" + this.getNumberOfWheels() +
                " fuelConsumption=" + this.getFuelConsumption() + "liters/100km" +
                " liftingCapacity=" + liftingCapacity + "kg";
    }

    /* methods */
    //#1
    public void printObjectCharacteristics(){
        System.out.println(this.toString() + "" + " capacity in kilowatts=" + super.convertHorsePowerToKilowattsCapacity());
    }

    //#2
    public void cargoCarLoading(int loadKilograms){
        if(loadKilograms < 0)
            System.out.println("Incorrect argument: enter positive number!");
        else if(loadKilograms == 0)
            System.out.println("You have not loaded anything!");
        else if(loadKilograms > this.liftingCapacity)
            System.out.println("You need a bigger truck");
        else
            System.out.println("Truck loaded");
    }

}//class ends



















