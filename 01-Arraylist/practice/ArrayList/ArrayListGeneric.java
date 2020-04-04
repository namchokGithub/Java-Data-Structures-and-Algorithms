package practice.ArrayList;

import java.util.ArrayList;

public class ArrayListGeneric {

    public static void main(String[] args) {
        // Example 1 :
            ArrayList<Tmp<Integer>> tmparr = new ArrayList<Tmp<Integer>>();
            Tmp<Integer> t = new Tmp<Integer>(5);
            tmparr.add(t);
            if(tmparr.contains(t)) {
                System.out.println("Found");
            } else {
                System.out.println("Not found");
            }

        // Example 2: 
            ArrayList<Tmp<Integer>> tmparr2 = new ArrayList<Tmp<Integer>>();
            Tmp<Integer> t2 = new Tmp<Integer>(5);
            tmparr2.add(t2);
            boolean flag = false;
            for (Tmp<Integer> tt : tmparr2) {
                if (tt.get() == (Integer)5) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Found");
            } else {
                System.out.println("Not found");
            }
    }
    // End main

    /**
     * Class Tmp
     * @param <T>
     */
    static public class Tmp<T> {
        T data;

        /**
         * @param d
         * Set data 
         */
        Tmp(T d) {
            data = d;
        }

        /**
         * @return data
         */
        T get(){
            return data;
        }
    }

}