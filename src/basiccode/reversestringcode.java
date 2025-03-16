package basiccode;

public class reversestringcode {
    public static void main(String[] args) {
        String str = "abhay";
        StringBuilder reversed = new StringBuilder(str).reverse();


        System.out.println("Original String:" + str);
        System.out.println("Reversed String:" + reversed);
    }
    }

