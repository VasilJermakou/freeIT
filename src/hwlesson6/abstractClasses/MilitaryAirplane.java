package hwlesson6.abstractClasses;

import java.util.Objects;

public class MilitaryAirplane extends AirTransport{

    /* class fields */
    private boolean isCatapultAvailable;
    private int numberOfRockets;

    /* constructors */
    public MilitaryAirplane(){
        super(55000, 2350, 10000, "Stealth", 18, 500);
        this.isCatapultAvailable = true;
        this.numberOfRockets = 24;
    }

    public MilitaryAirplane(int horsePower, String model, boolean isCatapultAvailable, int numberOfRockets){
        super(horsePower, 2350, 10000, model, 18, 500);
        this.isCatapultAvailable = isCatapultAvailable;
        this.numberOfRockets = numberOfRockets;
    }

    public MilitaryAirplane(int horsePower, int maxSpeed, int weight, String model, int wingSpan, int minRunwayLength, boolean isCatapultAvailable, int numberOfRockets){
        super(horsePower, maxSpeed, weight, model, wingSpan, minRunwayLength);
        this.isCatapultAvailable = isCatapultAvailable;
        this.numberOfRockets = numberOfRockets;
    }

    /* getters */
    public boolean isCatapultAvailable() {
        return isCatapultAvailable;
    }

    public int getNumberOfRockets() {
        return numberOfRockets;
    }

    /* setter */
    public void setNumberOfRockets(int numberOfRockets) {
        this.numberOfRockets = numberOfRockets;
    }

    /* object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MilitaryAirplane that = (MilitaryAirplane) o;
        return isCatapultAvailable == that.isCatapultAvailable && numberOfRockets == that.numberOfRockets;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isCatapultAvailable, numberOfRockets);
    }

    @Override
    public String toString() {
        return "MilitaryAirplane: " +
                " horsePower=" + this.getHorsePower() +
                " maxSpeed=" + this.getMaxSpeed() + "km/h" +
                " weight=" + this.getWeight() + "kg" +
                " model=" + this.getModel() +
                " wingSpan=" + this.getWingSpan() + "m" +
                " minRunwayLength=" + this.getMinRunwayLength() + "m" +
                " isCatapultAvailable=" + isCatapultAvailable +
                " numberOfRockets=" + numberOfRockets;
    }

    /* methods */
    //#1
    public void printObjectCharacteristics(){
        System.out.println(this.toString() + "" + " capacity in kilowatts=" + super.convertHorsePowerToKilowattsCapacity());
    }

    //#2
    public void shot(){
        if(this.numberOfRockets > 0){
            System.out.println("The shot happened");
            this.numberOfRockets--;
        }else
            System.out.println("No ammunition available!");
    }

    public boolean catapult(){
        boolean result;
        if(this.isCatapultAvailable){
            System.out.println("The bailout was successful");
            result = true;
        }
        else{
            System.out.println("This option is not available!");
            result = false;
        }
         return result;
    }

}//class ends