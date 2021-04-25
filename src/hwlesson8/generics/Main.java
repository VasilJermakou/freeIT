package hwlesson8.generics;

public class Main {
    public static void main(String[] args) {

        /**
         * Написать класс, который умеет хранить в себе массив любых типов данных
         * (int, long, etc.). Реализовать метод get(int index), который возвращает
         * любой элемент массива по индексу.
         * */

        GenericClass2<Integer> myInteger1 = new GenericClass2<>(1, 100);
        System.out.println(myInteger1.get(0));

        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};
        GenericClass2<Double> myDouble1 = new GenericClass2<>(doubles);

        System.out.println(myDouble1.get(5));

        for(Double d : myDouble1.getArray())
            System.out.print(d + " ");

        System.out.println("\n======================================");

        GenericClass<Integer> genInt1 = new GenericClass<>(100, "Integer");
        GenericClass<Integer> genInt2 = new GenericClass<>(200, "Integer");

        IGeneric<Integer> intMethods = new IGeneric<Integer>() {
            @Override
            public Integer summ(GenericClass<Integer> a, GenericClass<Integer> b) {
                return b.getValue() + a.getValue();
            }

            @Override
            public Integer subtraction(GenericClass<Integer> a, GenericClass<Integer> b) {
                return b.getValue() - a.getValue();
            }

            @Override
            public Integer multiply(GenericClass<Integer> a, GenericClass<Integer> b) {
                return b.getValue() * a.getValue();
            }

            @Override
            public Integer division(GenericClass<Integer> a, GenericClass<Integer> b) {
                if(a.getValue() != 0){
                    return b.getValue() / a.getValue();
                }
                return 0;
            }
        };

        System.out.println(intMethods.summ(genInt1, genInt2));
        System.out.println(intMethods.subtraction(genInt1, genInt2));
        System.out.println(intMethods.multiply(genInt1, genInt2));
        System.out.println(intMethods.division(genInt1, genInt2));

        System.out.println("======================================");

        GenericClass<Double> genDouble1 = new GenericClass<>(150.15, "Double");
        GenericClass<Double> genDouble2 = new GenericClass<>(250.25, "Double");

        IGeneric<Double> doubleMethods = new IGeneric<Double>() {
            @Override
            public Double summ(GenericClass<Double> a, GenericClass<Double> b) {
                return b.getValue() + a.getValue();
            }

            @Override
            public Double subtraction(GenericClass<Double> a, GenericClass<Double> b) {
                return b.getValue() - a.getValue();
            }

            @Override
            public Double multiply(GenericClass<Double> a, GenericClass<Double> b) {
                return b.getValue() * a.getValue();
            }

            @Override
            public Double division(GenericClass<Double> a, GenericClass<Double> b) {
                if(a.getValue() != 0)
                    return b.getValue() / a.getValue();

                return 0.0;
            }
        };

        System.out.printf("%.2f\n",doubleMethods.summ(genDouble1, genDouble2));
        System.out.printf("%.2f\n",doubleMethods.subtraction(genDouble1, genDouble2));
        System.out.printf("%.2f\n",doubleMethods.multiply(genDouble1, genDouble2));
        System.out.printf("%.2f\n",doubleMethods.division(genDouble1, genDouble2));

    }//main ends
}//class ends
