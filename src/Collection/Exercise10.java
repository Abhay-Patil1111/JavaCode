//Question
//Write a Java program to get the portion of a map whose keys range
//from a given key (inclusive) to another key (exclusive).

package Collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class Exercise10 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tree_Map = new TreeMap<Integer, String>();
        SortedMap<Integer,String> sub_tree_map = new TreeMap<Integer, String>();
        tree_Map.put(10,"red");
        tree_Map.put(20,"pink");
        tree_Map.put(30,"orange");
        tree_Map.put(40,"white");
        tree_Map.put(50,"black");

        System.out.println("original treemap: " +tree_Map);

        sub_tree_map = tree_Map.subMap(20,50);
        System.out.println(sub_tree_map);



    }
}
