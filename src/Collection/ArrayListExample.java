package Collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Banglore");
        cities.add("Hydrabad");
        cities.add("Pune");
        cities.add("Banglore");

        System.out.println("cities: " +cities);

        System.out.println("City at index 2: " + cities.get(2));

        System.out.println("cities after removal:");
        for (String city : cities){
            System.out.println(city);
        }
    }

}
