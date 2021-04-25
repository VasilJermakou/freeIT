package hwlesson6.interfaces.clothestask;

public class NikeFootWear implements IFootWear{
    @Override
    public void getDressed() {
        System.out.println("Nike FootWear dressed!");
    }

    @Override
    public void unDress() {
        System.out.println("Nike FootWear undressed!");
    }
}
