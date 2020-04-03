package practice.Generics;

import java.util.Scanner;

public class TestIntPair {

    public static void main(String[] args) {
        IntPair range = new IntPair(-5, 20);
        Scanner tk = new Scanner(System.in);
        int input = 0;

        do {
            System.out.printf("Enter a number in (%d to %d) : ",
                                range.getFirst(), range.getSecond());
            input = tk.nextInt();
        } while (input < range.getFirst() || input > range.getSecond());

        tk.close();
    }
}