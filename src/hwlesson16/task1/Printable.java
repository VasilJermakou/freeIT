package hwlesson16.task1;

@FunctionalInterface
public interface Printable<T> {

    void canPrint(T t);
}
