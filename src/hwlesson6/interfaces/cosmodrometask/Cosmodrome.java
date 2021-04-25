package hwlesson6.interfaces.cosmodrometask;

public class Cosmodrome {

    /* methods */
    public void start(IStart object){
        if(object.isSystemWorksCorrect()){
            object.engineStarting();
            for(int i = 10; i >= 1; i--){
                try {
                    Thread.sleep(1000);
                    System.out.println(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            object.go();
        }else
            System.out.println("Prelaunch check was failed");
    }

    /* object methods */

    @Override
    public String toString() {
        return "This is Cosmodrome";
    }
}//class ends
