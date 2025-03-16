//Question
//Write a Java program to copy all mappings from the specified map to another map.

package Collection;

import java.util.HashMap;

public class Exercise7 {
    public static void main(String[] args) {
        HashMap<Integer,String> hash_Map1 = new HashMap<Integer, String>();
        HashMap<Integer,String> hash_Map2 = new HashMap<Integer, String>();

        hash_Map1.put(1,"red");
        hash_Map1.put(2,"pink");
        hash_Map1.put(3,"white");
        System.out.println("\nValues in first map: "+hash_Map1);

        hash_Map2.put(4,"black");
        hash_Map2.put(5,"orange");
        hash_Map2.put(6,"grey");
        System.out.println("\nValues in second map: " +hash_Map2);

        hash_Map2.putAll(hash_Map1);
        System.out.println("\nNow values in second map: " +hash_Map2);
    }
}
