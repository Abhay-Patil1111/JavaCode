package Collection;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();

        countries.add("India");
        countries.add("USA");
        countries.add("Brazil");
        countries.add("India");

        System.out.println("Countries: " + countries);

        System.out.println("Contains 'USA': " + countries.contains("USA"));

        System.out.println("Itreating over HashSet:");
        for (String country : countries){
            System.out.println(country);


        }
    }
}
