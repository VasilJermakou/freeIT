package hwlesson7.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Department {

    /* class fields */
    private int IDDepartment;
    private String nameDepartment;
    private int plannedNumberOfEmployees;
    private int actualNumberOfEmployees;
    private DepartmentInfo info;

    /* constructors */
    public Department(){
        this.IDDepartment = 0;
        this.nameDepartment = "NoName";
        this.plannedNumberOfEmployees = 0;
        this.actualNumberOfEmployees = 0;
        this.info = this.new DepartmentInfo();
    }

    public Department(int IDDepartment, String nameDepartment, int plannedNumberOfEmployees, int actualNumberOfEmployees){
        this.IDDepartment = IDDepartment;
        this.nameDepartment = nameDepartment;
        this.plannedNumberOfEmployees = plannedNumberOfEmployees;
        this.actualNumberOfEmployees = actualNumberOfEmployees;
    }

    public Department(int IDDepartment, String nameDepartment, int plannedNumberOfEmployees, int actualNumberOfEmployees, List<Employee> currentEmployeesList, List<Employee> formerEmployees){
        this.IDDepartment = IDDepartment;
        this.nameDepartment = nameDepartment;
        this.plannedNumberOfEmployees = plannedNumberOfEmployees;
        this.actualNumberOfEmployees = actualNumberOfEmployees;
        this.info = this.new DepartmentInfo(currentEmployeesList, formerEmployees);
    }

    /* getters & setters */
    public int getIDDepartment() {
        return IDDepartment;
    }

    public void setIDDepartment(int IDDepartment) {
        this.IDDepartment = IDDepartment;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public int getPlannedNumberOfEmployees() {
        return plannedNumberOfEmployees;
    }

    public void setPlannedNumberOfEmployees(int plannedNumberOfEmployees) {
        this.plannedNumberOfEmployees = plannedNumberOfEmployees;
    }

    public int getActualNumberOfEmployees() {
        return actualNumberOfEmployees;
    }

    public void setActualNumberOfEmployees(int actualNumberOfEmployees) {
        this.actualNumberOfEmployees = actualNumberOfEmployees;
    }

    public DepartmentInfo getInfo() {
        return info;
    }

    /* object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return IDDepartment == that.IDDepartment && plannedNumberOfEmployees == that.plannedNumberOfEmployees && actualNumberOfEmployees == that.actualNumberOfEmployees && Objects.equals(nameDepartment, that.nameDepartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IDDepartment, nameDepartment, plannedNumberOfEmployees, actualNumberOfEmployees);
    }

    @Override
    public String toString() {
        return "Department{" +
                "IDDepartment=" + IDDepartment +
                ", nameDepartment='" + nameDepartment + '\'' +
                ", plannedNumberOfEmployees=" + plannedNumberOfEmployees +
                ", actualNumberOfEmployees=" + actualNumberOfEmployees +
                '}';
    }

    /* inner class */
    public class DepartmentInfo{

        /* inner class fields */
        private List<Employee> currentEmployeesList;
        private List<Employee> formerEmployees;

        /* constructors */
        public DepartmentInfo(){
            this.currentEmployeesList = new ArrayList<>(6);
            this.formerEmployees = new ArrayList<>(1);
        }

        public DepartmentInfo(List<Employee> currentEmployeesList, List<Employee> formerEmployees){
            this.currentEmployeesList = currentEmployeesList;
            this.formerEmployees = formerEmployees;
        }

        /* getters & setters */
        public List<Employee> getCurrentEmployeesList() {
            return currentEmployeesList;
        }

        public void setCurrentEmployeesList(List<Employee> currentEmployeesList) {
            this.currentEmployeesList = currentEmployeesList;
        }

        public List<Employee> getFormerEmployees() {
            return formerEmployees;
        }

        public void setFormerEmployees(List<Employee> formerEmployees) {
            this.formerEmployees = formerEmployees;
        }

        /* object methods */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DepartmentInfo that = (DepartmentInfo) o;
            return Objects.equals(currentEmployeesList, that.currentEmployeesList) && Objects.equals(formerEmployees, that.formerEmployees);
        }

        @Override
        public int hashCode() {
            return Objects.hash(currentEmployeesList, formerEmployees);
        }

        @Override
        public String toString() {
            return "DepartmentInfo{" +
                    "currentEmployeesList=" + currentEmployeesList +
                    ", formerEmployees=" + formerEmployees +
                    '}';
        }

        /* methods */
        public void printCurrentEmployees(){
            this.currentEmployeesList.stream().forEach(employee -> System.out.printf(employee.toString() + " "));
        }

        public double countTotalSalary(){
            Optional<Employee> optional = this.currentEmployeesList.stream().reduce( (x, y) -> {int counter = 0;
                                                                  counter += x.getSalary() + y.getSalary();
                                                                  return new Employee("result", Positions.MANAGER, counter);});
            double result = 0;
            if(optional.isPresent())
                result = optional.get().getSalary();

            return result;
        }

        public void printAllPositions(){
            this.currentEmployeesList.stream().forEach( employee -> System.out.println(employee.getPosition()));
        }

        public void printDateOfEmployment(){
            this.currentEmployeesList.stream().forEach( employee -> System.out.println(employee.getName() + " : " + employee.getDateOfEmployment()));
        }
    }//inner class ends

}//class ends
