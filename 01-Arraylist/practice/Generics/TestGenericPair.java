package practice.Generics;

public class TestGenericPair {

    public static void main(String[] args) {
        Pair<Integer> integer = new Pair<Integer>(-1, 20);
        Pair<Double> doubleNumber = new Pair<Double>(12.2, 14.1);
        Pair<Character> character = new Pair<Character>('A', 'F');
        Pair<String> string = new Pair<String>("Namchok", "String");


        System.out.println("Integer pair: ("+integer.getFirst()+","+integer.getSecond()+")");
        System.out.println("Double pair: ("+doubleNumber.getFirst()+","+doubleNumber.getSecond()+")");
        System.out.println("Character pair: ("+character.getFirst()+","+character.getSecond()+")");
        System.out.println("String pair: ("+string.getFirst()+","+string.getSecond()+")");
    }

}