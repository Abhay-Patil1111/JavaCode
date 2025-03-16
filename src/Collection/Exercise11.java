//Question
//Write a Java program to get a key-value mapping associated with the least key greater than or equal to
// the given key. Return null if there is no such key.

package Collection;

import java.util.TreeMap;

public class Exercise11 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tree_Map1 = new TreeMap<Integer, String>();
        tree_Map1.put(1,"red");
        tree_Map1.put(2,"pink");
        tree_Map1.put(3,"white");
        tree_Map1.put(4,"black");
        tree_Map1.put(5,"grey");

        System.out.println("original treemap: " +tree_Map1);
        System.out.println("tree greater than equal to 20: " +tree_Map1.ceilingEntry(20));

    }
}
