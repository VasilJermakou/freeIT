package hwlesson6.interfaces.robottask;

public class ToshibaLeg implements ILeg{
    @Override
    public void step() {
        System.out.println("This is Toshiba leg. I can go!");
    }

    @Override
    public int getPrice() {
        return 200;
    }
}
