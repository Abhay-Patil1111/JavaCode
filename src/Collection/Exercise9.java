//Question
//Write a Java program to get a  key-value mapping associated with the greatest key and the
// least key in a map.

package Collection;

import java.util.TreeMap;

public class Exercise9 {
    public static void main(String[] args) {
        TreeMap<String,String> tree_Map = new TreeMap<String, String>();

        tree_Map.put("c1","arvi");
        tree_Map.put("c2", "athrav");
        tree_Map.put("c3","arnav");
        tree_Map.put("c4","vishu");
        tree_Map.put("c5","ravi");

        System.out.println("Original tree map content: " +tree_Map);
        System.out.println("Greatest key: " +tree_Map.firstEntry());
        System.out.println("Lesst key: " +tree_Map.lastEntry());
    }
}
