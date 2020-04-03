package practice.Generics;

// We can have more than one generic type in a generic class
// Each pair can have two values of different data types
public class NewPair<S, T> {
    private S first;
    private T second;

    public NewPair(S a, T b) {
        first = a;
        second = b;
    }

    public S getFirst() { return first; }
    public T getSecond() { return second; }
}