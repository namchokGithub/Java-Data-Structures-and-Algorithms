package practice.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList01 {

    public static void main(String[] args) {
        Scanner tk = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer a;

        System.out.println("Enter a list of integer, press -1 to end.");
        while ((a=tk.nextInt())!=-1) {
            list.add(a);
        }

        // Using ArrayList's toString()
        System.out.println(list);

        // Move first value to last
        list.add(list.remove(0));

        System.out.println(list);

        // Use contains() to check if the element 1 exits or not
        if(list.contains(1)) {
            System.out.println("Found 1");
        } else {
            System.out.println("Not found 1");
        }

        tk.close();
    }
}