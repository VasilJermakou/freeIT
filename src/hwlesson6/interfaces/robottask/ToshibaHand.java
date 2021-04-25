package hwlesson6.interfaces.robottask;

public class ToshibaHand implements IHand{
    @Override
    public void handUp() {
        System.out.println("This is Toshiba hand. I can raise up hands!");
    }

    @Override
    public int getPrice() {
        return 200;
    }
}
