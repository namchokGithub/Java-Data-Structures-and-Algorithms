package challenges;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * challenge01
 */
public class challenge01 {

    public static void main(String[] args) {
        ArrayList<String> fruitAll  = new ArrayList<String>();
        ArrayList<Double> weightAll = new ArrayList<Double>();

        Scanner tk = new Scanner(System.in);
        
        String type;
        double weight;

        do {
            type = tk.next();

            if(type.charAt(0)=='*') {
                break;
            } else {
                weight = tk.nextDouble();
                weightAll.add(weight);
            }

            fruitAll.add(type);

        } while (type.charAt(0)!='*');
        // End loop

        System.out.println(fruitAll);
        System.out.println(weightAll);

        // int size = fruitAll.size();

        // for (int i = 0; i < size; i++) {
            
        // }

        tk.close();
        
    }
    // Main
    
}