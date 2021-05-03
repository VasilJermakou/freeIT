package hwlesson15.task4;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CallCenter {
    public static void main(String[] args) {

        /**
         * Task4
         * CallCenter. В организации работает несколько операторов. Оператор может
         * обслуживать только одного клиента, остальные должны ждать своей очереди.
         * Клиент может положить трубку и перезвонить еще раз через некоторое время.
         * */

        //create list of customers
        List<Customer> customerList1 = List.of(new Customer(1,"Vasil", "What is the work schedule today?"),
                                               new Customer(2,"Maria", "Do you have discounts?"),
                                               new Customer(3,"Emily", "Do you have shops in Grodno?"),
                                               new Customer(4,"Georg", "How can I get back mu money?"),
                                               new Customer(5,"Peppa", "I want to make an order, can you help me ?"),
                                               new Customer(6,"Eduard", "I have blocked my app, can you help me&?"),
                                               new Customer(7,"Julia", "I forgot my password, what can i do?"),
                                               new Customer(8,"Anna", "I have blocked my account, what can i do?"),
                                               new Customer(9,"Sofia", "How can i speak to mst. Johnson?"),
                                               new Customer(10,"Artur", "How can i speak with general manager?"));

        //create object of currentCustomers
        CurrentCustomers currentCustomers = new CurrentCustomers(customerList1);

        CallCenter.work(currentCustomers);
    }//main ends

    /* static methods */
    public static void work(CurrentCustomers currentCustomers){
        try {
            ExecutorService operatorExecutorService = Executors.newFixedThreadPool(2);
            for(int i = 0; i < currentCustomers.getCustomers().size(); i++){
                operatorExecutorService.submit(currentCustomers.getCustomers().get(i));
            }
            operatorExecutorService.shutdown();
            operatorExecutorService.awaitTermination(20, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}//class ends
