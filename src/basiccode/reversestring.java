package basiccode;

public class reversestring {
    public static void main(String[] args){
        String str = "Abhay Patil";
        StringBuilder reversed = new StringBuilder(str).reverse();

        System.out.println("Original String:" + str);
        System.out.println("Reversed String:" + reversed);

    }
}
