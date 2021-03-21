package hwlesson2.task2;

public class Main {
    public static void main(String[] args) {

        /**
         * 2.
         * Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
         * Определить существует ли такой треугольник.
         * Дано: a, b, c –стороны предполагаемого треугольника.
         * Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
         * Если хотя бы в одном случае отрезок окажется больше суммы двух других,
         * то треугольника с такими сторонами не существует.
         * */

        System.out.println("===========================================");
        int a = 1;
        int b = 1;
        int c = 5;

        if( (a+b)+(a+c)>(b+c) || (c+a)+(c+b)>(b+a) || (b+a)+(b+c)>(a+c))
            System.out.println("Такой треугольник существует");
        else
            System.out.println("Такого треугольника не сеществует");

        System.out.println("===========================================");

    }//main ends
}//class ends