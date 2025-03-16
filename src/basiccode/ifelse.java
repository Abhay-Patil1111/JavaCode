package basiccode;
import java.util.*;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        int n;
        System.out.println("Enter a number");
        Scanner a = new Scanner(System.in);
        n = a.nextInt();
        if(n>=0){
            System.out.println("+ve number");
        }
        else{
            System.out.println("-number");
        }
    }

}
