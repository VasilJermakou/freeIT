package hwlesson15.task4;

import java.util.Objects;

public class Customer implements Runnable{

    /* class fields */
    private int id;
    private String name;
    private String question;

    /* constructors */
    public Customer(){
        this.id = 0;
        this.name = "noName";
        this.question = "noQuestion";
    }

    public Customer(int id, String name, String question){
        this.id = id;
        this.name = name;
        this.question = question;
    }

    /* getters & setters */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    /* object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(question, customer.question);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, question);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", question='" + question + '\'' +
                '}';
    }

    /* methods */
    @Override
    public void run() {
        try {
            System.out.println("Customer " + this.id + " starts calling ...");
            System.out.println("Hello, my name is " + this.name);
            System.out.println(this.question);
            Thread.sleep(3000);
            System.out.println("Customer " + this.id + " finished :)");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}//class ends
