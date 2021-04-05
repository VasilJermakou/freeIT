package hwlesson6.interfaces.robottask;

public class SamsungLeg implements ILeg{
    @Override
    public void step() {
        System.out.println("This is Samsung leg. I can go!");
    }

    @Override
    public int getPrice() {
        return 300;
    }
}
