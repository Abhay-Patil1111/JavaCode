//Question
//Write a Java program to join two array lists.

package Collection;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("red");
        c1.add("blue");
        c1.add("yellow");
        c1.add("pink");
        c1.add("black");

        System.out.println("List of first array: " +c1);
        List<String> c2 = new ArrayList<>();

        c2.add("white");
        c2.add("orange");
        c2.add("green");
        System.out.println("List of second array: " +c2);

        List<String> a = new ArrayList<>();
        a.addAll(c1);
        a.addAll(c2);

        System.out.println("New array: " +a);


    }
}
