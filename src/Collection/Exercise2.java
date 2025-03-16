//Question
//Write a Java program to increase an array list size.

package Collection;

import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>(3);
        c1.add("red");
        c1.add("blue");
        c1.add("pink");

        System.out.println("original arraylist: " +c1);
        c1.ensureCapacity(3);
        c1.add("black");
        c1.add("yellow");
        c1.add("orange");
        System.out.println("Incresed arraylist: " +c1);
    }
}
