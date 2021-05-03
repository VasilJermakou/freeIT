package hwlesson15.task4;

public class Operator implements Runnable {

    /**
     * OPTIONAL
     * */

    /* class fields */
    private int clients;

    /* constructors */
    public Operator(){}

    public Operator(int clients){
        this.clients = clients;
    }

    /* getter & setter */
    public int getClients() {
        return clients;
    }

    public void setClients(int clients) {
        this.clients = clients;
    }

    /* object methods */
    @Override
    public String toString() {
        return "Operator{" +
                "clients=" + clients +
                '}';
    }

    /* methods */
    @Override
    public void run() {
        for(int i = 1; i <= this.clients; i++){
            try {
                System.out.println("Operator serves client #" + i);
                Thread.sleep(1000);
                System.out.println("Operator finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}//class ends
