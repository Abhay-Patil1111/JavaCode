//Question
//Write a Java program to replace the second element of an ArrayList with the specified element

package Collection;

import java.util.ArrayList;

public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>();
        color.add("pink");
        color.add("grey");

        System.out.println("original arraylist: " +color);

        String new_color = "white";
        color.set(1, new_color);

        int num = color.size();
        System.out.println("Replace second element with 'white'");
        for(int i=0; i<num; i++){
            System.out.println(color.get(i));
        }

    }
}
