package practice;

/**
 * Array04
 */
public class Array04 {

    public static void main(String[] args) {
        double[] values;

        // Call function for make array
        values = makeArray(5, 999.00);

        for (double value: values) {
            System.out.println(value + " ");
        }
    }
    // End main

    /**
     * @param size
     * @param limit
     * @return array of double
     */
    public static double[] makeArray(int size, double limit) {
        double[] arr = new double[size];
        
        for (int i=0; i<arr.length; i++) {
            arr[i] = limit / (i+1);
        }

        return arr;
    }
    // End makeArray
}