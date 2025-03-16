package Collection;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(25);
        numbers.add(45);

        numbers.remove(Integer.valueOf(23));

        numbers.remove(2);

        System.out.println("After removal: " + numbers);
    }

}
