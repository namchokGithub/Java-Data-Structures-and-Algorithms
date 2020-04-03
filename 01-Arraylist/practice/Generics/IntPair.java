package practice.Generics;

// a can be easily extended to other data types
public class IntPair {
    private int first, second;

    /**
     * @param a
     * @param b
     * Set variable of first and second
     */
    public IntPair(int a, int b) {
        first = a;
        second = b;
    }

    public int getFirst() { return first; } // get first integer
    public int getSecond() { return second; } // get second integer
}