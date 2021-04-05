package hwlesson6.interfaces.robottask;

public class SamsungHand implements  IHand{
    @Override
    public void handUp() {
        System.out.println("This is Samsung hand. I can raise up hands!");
    }

    @Override
    public int getPrice() {
        return 300;
    }
}
