package hwlesson8.generics;

import java.util.Arrays;

public class GenericClass2 <T>{

    /* class fields */
    private T[] array;

    /* constructor */
    public GenericClass2(T[] array){
        this.array = array;
    }

    public GenericClass2(int size, T element){
        this.array = (T[]) new Object[size];
        this.array[0] = element;
    }

    /* getters & setters */
    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    /* object methods */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericClass2<?> that = (GenericClass2<?>) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "GenericClass2{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    /* methods */
    public T get(int index){
        T result = null;
        if(index >= 0 && index < array.length)
             result = this.array[index];
        return result;
    }

}//class ends
