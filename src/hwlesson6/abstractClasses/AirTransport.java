package hwlesson6.abstractClasses;

import java.util.Objects;

public abstract class AirTransport extends Transport {

    /* class fields */
    private int wingSpan;
    private int minRunwayLength;

    /* constructors */
    public AirTransport(int horsePower, int maxSpeed, int weight, String model, int wingSpan, int minRunwayLength){
        super(horsePower, maxSpeed, weight, model);
        this.wingSpan = wingSpan;
        this.minRunwayLength = minRunwayLength;
    }

    /* getters */
    public int getWingSpan() {
        return wingSpan;
    }

    public int getMinRunwayLength() {
        return minRunwayLength;
    }

    /* object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AirTransport that = (AirTransport) o;
        return wingSpan == that.wingSpan && minRunwayLength == that.minRunwayLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wingSpan, minRunwayLength);
    }

    @Override
    public String toString() {
        return "AirTransport{" +
                "wingSpan=" + wingSpan +
                ", minRunwayLength=" + minRunwayLength +
                '}';
    }

}//class ends
