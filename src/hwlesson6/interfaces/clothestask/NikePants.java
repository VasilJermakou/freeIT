package hwlesson6.interfaces.clothestask;

public class NikePants implements IPants{
    @Override
    public void getDressed() {
        System.out.println("Nike Pants dressed!");
    }

    @Override
    public void unDress() {
        System.out.println("Nike Pants undressed!");
    }
}
