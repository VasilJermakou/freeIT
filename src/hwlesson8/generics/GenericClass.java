package hwlesson8.generics;

import java.util.Objects;

public class GenericClass <T extends Number>{

    /* class fields */
    private T value;
    private String name;

    /* constructor */
    public GenericClass(T element, String name){
        this.value = element;
        this.name = name;
    }

    /* getters & setters */
    public T getValue(){
        return this.value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public String getName(){
        return  this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    /* object methods */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericClass<?> that = (GenericClass<?>) o;
        return Objects.equals(value, that.value) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, name);
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }

}//class ends
