package practice.Generics;

public class TestNewGenericPair {

    public static void main(String[] args) {
        NewPair<String, Integer> people = new NewPair<String,Integer>("Namchok", 100);

        System.out.println("Name: " + people.getFirst());
        System.out.println("Age: " + people.getSecond());

    }
    // End main
}