//Question
//Write a Java program to search for a key in a Tree Map.

package Collection;

import java.util.TreeMap;

public class Exercise8 {
    public static void main(String[] args) {
        TreeMap<String,String> tree_Map = new TreeMap<String, String>();
        tree_Map.put("C1","White");
        tree_Map.put("C2","Black");
        tree_Map.put("C3","Pink");

        System.out.println(tree_Map);

        if(tree_Map.containsKey("C1")){
            System.out.println("the tree map contains key C1");
        }else {
            System.out.println("The tree map contains key C1");
        }
        if (tree_Map.containsKey("C5")){
            System.out.println("The tree map contains key C5");
        }else {
            System.out.println("The tree map does not contains key C5");
        }
        }
    }

