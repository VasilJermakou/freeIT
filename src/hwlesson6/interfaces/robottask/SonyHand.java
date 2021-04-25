package hwlesson6.interfaces.robottask;

public class SonyHand implements IHand{
    @Override
    public void handUp() {
        System.out.println("This is Sony hand. I can raise up hands!");
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
