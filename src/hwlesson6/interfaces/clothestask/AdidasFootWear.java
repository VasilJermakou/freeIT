package hwlesson6.interfaces.clothestask;

public class AdidasFootWear implements IFootWear{
    @Override
    public void getDressed() {
        System.out.println("Adidas FootWear dressed!");
    }

    @Override
    public void unDress() {
        System.out.println("Adidas FootWear undressed!");
    }
}
