package hwlesson6.interfaces.robottask;

public class ToshibaHead implements IHead{
    @Override
    public void speak() {
        System.out.println("This is Toshiba head. I can speak!");
    }

    @Override
    public int getPrice() {
        return 200;
    }
}
