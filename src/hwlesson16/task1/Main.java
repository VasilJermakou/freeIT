package hwlesson16.task1;

public class Main {
    public static void main(String[] args) {

        /**
         * Создать свой функциональный интерфейс для вывода на консоль данных объекта.
         * С помощью лямбда-выражения вывести данные для объектов типа String и Integer.
         * */

        Printable<Integer> p1 = (i) -> System.out.println(i);
        p1.canPrint(10);

        Printable<String> s1 = (s) -> System.out.println(s);
        s1.canPrint("Java");
    }
}
