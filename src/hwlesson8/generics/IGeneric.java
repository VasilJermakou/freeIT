package hwlesson8.generics;

public interface IGeneric <T extends Number>{

    T summ(GenericClass<T> a, GenericClass<T> b);
    T subtraction(GenericClass<T> a, GenericClass<T> b);
    T multiply(GenericClass<T> a, GenericClass<T> b);
    T division(GenericClass<T> a, GenericClass<T> b);

}//interface ends
