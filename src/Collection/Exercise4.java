//Question
//Write a Java program to print all the elements of an ArrayList using the elements' position.

package Collection;

import java.util.ArrayList;

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("red");
        c1.add("blue");
        c1.add("pink");
        c1.add("black");

        System.out.println("\noriginal arraylist: " + c1);
        System.out.println("\nprint usin index of an element: " );

        int no_of_element = c1.size();
        for(int index = 0; index < no_of_element; index++){
            System.out.println(index);
            System.out.println(c1.get(index));

        }
    }
}