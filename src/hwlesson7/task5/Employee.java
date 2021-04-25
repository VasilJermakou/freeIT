package hwlesson7.task5;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    /* class fields */
    private int ID;
    private String name;
    private Positions position;
    private double salary;
    private LocalDate dateOfEmployment;
    private LocalDate dateOfDismissal;

    /* static fields */
    public static int IDCounter = 1;

    /* constructors */
    public Employee(String name){
        this.ID = Employee.IDCounter++;
        this.name = name;
        this.position = Positions.MANAGER;
        this.salary = 500.0;
        this.dateOfEmployment = LocalDate.now();
        this.dateOfDismissal = null;
    }

    public Employee(String name, Positions position, double salary){
        this.ID = Employee.IDCounter++;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dateOfEmployment = LocalDate.now();
        this.dateOfDismissal = null;
    }

    public Employee(String name, Positions position, double salary, LocalDate dateOfEmployment){
        this.ID = Employee.IDCounter++;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dateOfEmployment = dateOfEmployment;
        this.dateOfDismissal = null;
    }

    /* getters & setters */
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Positions getPosition() {
        return position;
    }

    public void setPosition(Positions position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public LocalDate getDateOfDismissal() {
        return dateOfDismissal;
    }

    public void setDateOfDismissal(LocalDate dateOfDismissal) {
        this.dateOfDismissal = dateOfDismissal;
    }

    public static int getIDCounter() {
        return IDCounter;
    }

    /* object methods */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return ID == employee.ID && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && position == employee.position && Objects.equals(dateOfEmployment, employee.dateOfEmployment) && Objects.equals(dateOfDismissal, employee.dateOfDismissal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, position, salary, dateOfEmployment, dateOfDismissal);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                ", dateOfEmployment=" + dateOfEmployment +
                ", dateOfDismissal=" + dateOfDismissal +
                '}';
    }
}//class ends
