//Question
//Write a Java program to associate the specified value with the specified key in a HashMap.

package Collection;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Map;

public class Exercise5 {
    public static void main(String[] args) {
        HashMap<Integer,String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1,"red");
        hash_map.put(2,"pink");
        hash_map.put(3,"black");
        hash_map.put(4,"white");
        hash_map.put(5,"orange");
        for (Map.Entry a:hash_map.entrySet()){
            System.out.println(a.getKey()+" "+a.getValue());
        }
    }
}
