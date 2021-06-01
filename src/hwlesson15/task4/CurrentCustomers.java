package hwlesson15.task4;

import java.util.ArrayList;
import java.util.List;

public class CurrentCustomers {

    /* class fields */
    private List<Customer> customers;

    /* constructors */
    public CurrentCustomers(){
        this.customers = new ArrayList<>(6);
    }

    public CurrentCustomers(List<Customer> list){
        this.customers = list;
    }

    /* getter and setter */
    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    /* object method */
    @Override
    public String toString() {
        return "CurrentCustomers{" +
                "customers=" + customers +
                '}';
    }
}//class ends
