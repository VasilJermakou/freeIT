package hwlesson6.interfaces.clothestask;

public class AdidasPants implements IPants{
    @Override
    public void getDressed() {
        System.out.println("Adidas Pants dressed!");
    }

    @Override
    public void unDress() {
        System.out.println("Adidas Pants undressed!");
    }
}
