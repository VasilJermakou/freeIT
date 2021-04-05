package hwlesson6.interfaces.robottask;

public class SonyLeg implements ILeg{
    @Override
    public void step() {
        System.out.println("This is Sony leg. I can go!");
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
