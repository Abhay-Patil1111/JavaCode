package Collection;

import java.util.HashMap;
import java.util.Map;

public class HasMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101,"John");
        students.put(201,"Bob");
        students.put(301,"Hatty");

        //display elements
        System.out.println("Students: " +students);

        //find by id
        System.out.println("student with ID: 201 " + students.get(201));

        //remove by entry
        students.remove(301);

        //itrate all entries
        System.out.println("Remaining students:");

        for (Map.Entry<Integer,String> entry : students.entrySet()){
            System.out.println("ID: " + entry.getKey() + ",Name: " +entry.getValue());
        }
    }
}
