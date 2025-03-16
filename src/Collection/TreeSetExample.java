package Collection;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(12);
        numbers.add(15);
        numbers.add(10);

        System.out.println("Number: " +numbers);
       // System.out.println("Numbers in TreeSet (Sorted): " + numbers);

        System.out.println("First Element: " + numbers.first());
        System.out.println("Last Element: " + numbers.last());

        System.out.println("Itreating over TreeSet");
        for (int number: numbers){
            System.out.println(number);
        }

    }
}
