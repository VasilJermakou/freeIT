package hwlesson16.task5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /**
         * Задать список учеников с принадлежностью к классу (создать класс Student).
         * Используя средства Stream API
         * 1) вывести список фамилий
         * 2) создать Map со списком учеников для каждого класса
         * */

        //creating students
        Student student1 = new Student("Anna", 1);
        Student student2 = new Student("Barbara", 1);
        Student student3 = new Student("Victoria", 1);
        Student student4 = new Student("Glen", 2);
        Student student5 = new Student("Maks", 2);
        Student student6 = new Student("Tim", 2);

        //creating group list and add students
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        //print students names
        students.stream().forEach((s)-> System.out.println(s.getName()));

        //creating list for group1
        List<Student> group1 = students.stream().filter((student) -> student.getGroup() == 1).collect(Collectors.toList());
        //group1.stream().forEach((s)-> System.out.println(s));

        //creating list for group2
        List<Student> group2 = students.stream().filter((student) -> student.getGroup() == 2).collect(Collectors.toList());
        //group2.stream().forEach((s)-> System.out.println(s));

        //creating map for groups
        Map<Integer, List<Student>> groups = new HashMap<>();
        groups.put(1, group1);
        groups.put(2, group2);
        System.out.println(groups.toString());
    }
}
