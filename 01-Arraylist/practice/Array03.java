package practice;

/**
 * Array03
 * The reference to the array is passed into a method
 * Any modification of the elements in the method will affect the actual array
 */
public class Array03 {

    public static void main(String[] args) {
        int[] list = {22, 55 , 33};

        swap(list, 0, 2);

        for (int element: list) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}