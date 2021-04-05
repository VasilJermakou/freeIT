package hwlesson6.interfaces.robottask;

public class SamsungHead implements IHead{
    @Override
    public void speak() {
        System.out.println("This is Samsung head. I can speak!");
    }

    @Override
    public int getPrice() {
        return 300;
    }
}
