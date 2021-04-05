package hwlesson6.interfaces.clothestask;

public class AdidasJacket implements IJacket{
    @Override
    public void getDressed() {
        System.out.println("Adidas Jacket dressed!");
    }

    @Override
    public void unDress() {
        System.out.println("Adidas Jacket undressed!");
    }
}
