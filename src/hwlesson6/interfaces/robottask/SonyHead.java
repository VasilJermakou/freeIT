package hwlesson6.interfaces.robottask;

public class SonyHead implements IHead{

    @Override
    public void speak() {
        System.out.println("This is Sony head. I can speak!");
    }

    @Override
    public int getPrice() {
        return 100;
    }
}
