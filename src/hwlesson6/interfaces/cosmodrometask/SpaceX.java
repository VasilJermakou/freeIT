package hwlesson6.interfaces.cosmodrometask;

import java.util.Random;

public class SpaceX implements IStart{

    /* methods */
    @Override
    public boolean isSystemWorksCorrect() {
        Random random = new Random();
        int randNum = random.nextInt(20) + 1;
        if(randNum > 10)
            return true;
        else
            return false;
    }

    @Override
    public void engineStarting() {
        System.out.println("The SpaceX engines are running. All systems are normal.");
    }

    @Override
    public void go() {
        System.out.println("SpaceX go!!!");
    }

    /* object methods */
    @Override
    public String toString() {
        return "This is SpaceX";
    }
}
