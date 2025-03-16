//Question
//Write a Java program to check whether a map contains key-value mappings (empty) or not.
package Collection;

import java.util.HashMap;

public class Exercise6 {
    public static void main(String[] args) {
        HashMap<Integer,String> hash_Map = new HashMap<Integer, String>();
        hash_Map.put(1,"red");
        hash_Map.put(2,"pink");
        hash_Map.put(3,"black");
        hash_Map.put(4,"white");
        hash_Map.put(5,"orange");

        boolean result = hash_Map.isEmpty();
        System.out.println("Is hash map is empty: " +result);

        hash_Map.clear();

        result = hash_Map.isEmpty();

        System.out.println("Is hash map is emapty: " +result);
    }
}
