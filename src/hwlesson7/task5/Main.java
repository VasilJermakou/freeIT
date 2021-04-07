package hwlesson7.task5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * Task 5
         * Создать класс Department с внутренним классом, с помощью объектов
         * которого можно хранить информацию обо всех должностях отдела и обо
         * всех сотрудниках, когда-либо занимавших конкретную должность
         * */

        //create employees
        Employee employee1 = new Employee("Johnson", Positions.SECRETARY, 350, LocalDate.of(2021, 4, 7));
        Employee employee2 = new Employee("Franklin", Positions.MANAGER, 450, LocalDate.of(2021, 3, 1));
        Employee employee3 = new Employee("Abrahamson", Positions.HEAD_ECONOMIST, 1200, LocalDate.of(2021, 1, 10));
        Employee employee4 = new Employee("Linkoln", Positions.HEAD_LOWYER, 1380, LocalDate.of(2021, 2, 18));
        Employee employee5 = new Employee("Adamson", Positions.CHEIF_PERSONNEL_OFFICER, 990, LocalDate.of(2020, 8, 9));
        Employee employee6 = new Employee("Grant", Positions.HEAD_OF_DEPARTMENT, 1500, LocalDate.of(2020, 4, 2));

        //create collection and add employees
        List<Employee> employeeList1 = new ArrayList<>(6);
        employeeList1.add(employee1);
        employeeList1.add(employee2);
        employeeList1.add(employee3);
        employeeList1.add(employee4);
        employeeList1.add(employee5);
        employeeList1.add(employee6);

        //create Department object
        Department financeDepartment = new Department(1, "Finance Department", 6, 6, employeeList1, new ArrayList<Employee>(1));

        //test methods
        financeDepartment.getInfo().printCurrentEmployees();
        System.out.println("");

        System.out.println("\nTotal salary = " + financeDepartment.getInfo().countTotalSalary());
        System.out.println("");

        financeDepartment.getInfo().printAllPositions();
        System.out.println("");

        financeDepartment.getInfo().printDateOfEmployment();
        System.out.println("");
    }//main ends
}//class ends
