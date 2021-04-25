package hwlesson6.interfaces.cosmodrometask;

import java.util.Random;

public class Shuttle implements IStart{

    /* methods */
    @Override
    public boolean isSystemWorksCorrect() {
        Random random = new Random();
        int randNum = random.nextInt(10) + 1;
        if(randNum > 3)
            return true;
        else
            return false;
    }

    @Override
    public void engineStarting() {
        System.out.println("The Shuttle's engines are running. All systems are normal.");
    }

    @Override
    public void go() {
        System.out.println("Shuttle go!!!");
    }

    /* object methods */
    @Override
    public String toString() {
        return "This is Shuttle";
    }

}//class ends
