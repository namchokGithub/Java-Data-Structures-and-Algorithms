package practice;

import java.util.Arrays;

/**
 * Array02
 */
public class Array02 {
    public static void main(String[] args) {
        // Construct and initialise array
        double[] ary = { 22.5, 21, 35.5, 19.1};

        // using the length attribute
        System.out.println(" Length = " + ary.length);

        for (int i=0; i<ary.length; i++) {
            System.out.print(ary[i] + " ");
        }

        System.out.println();

        // Alternative way for print
        for (double element : ary) {
            System.out.print(element + " ");
        }

        System.out.println();

        // Using toString() method in Arrays class
        System.out.println(Arrays.toString(ary));
    }    
}