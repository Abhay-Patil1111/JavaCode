package basiccode;
import java.util.Scanner;
public class ifstatement {
public static void main (String[] args){
    int age;
    System.out.println("Enter your Age..!");
    Scanner a = new Scanner(System.in);
    age = a.nextInt();
    if(age>=18){
        System.out.println("Eligible for vote...");
    }
    System.out.println("Thank you");
}

}
