package practice;
/**
 * Array
 * Every array has a public length attribute (it is not a method!)
 */
public class Array01 {

    public static void main(String[] args) {
        // In Java, array is an object.
        int[] ary; 

        // create a new integer array with 5 element
        // ary now refers (points) to this new array
        ary = new int[5];

        // using the length attribute for check length
        System.out.println("Length = " + ary.length);

        // accessing individual array element
        ary[0] = 100;
        ary[1] = ary[0] - 20;
        ary[2] = ary[1] / 2;

        // print array
        for (int i=0; i<ary.length; i++) {
            System.out.println("ary["+ i +"] = " + ary[i]);
        }

    }
}