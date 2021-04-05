package hwlesson6.interfaces.clothestask;

public class NikeJacket implements IJacket{
    @Override
    public void getDressed() {
        System.out.println("Nike Jacket dressed!");
    }

    @Override
    public void unDress() {
        System.out.println("Nike Jacket undressed!");
    }
}
