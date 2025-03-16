package basiccode;
import java.util.*;

import java.util.Scanner;

public class ifelseladder {
    public static void main(String[] args){
        int marks;
        System.out.println("Enter a marks:");
        Scanner ap = new Scanner(System.in);
        marks = ap.nextInt();
        if(marks>80){
            System.out.println("Topper");
        }
        else if(marks<80 && marks>60){
            System.out.println("First");
        }
        else{
            System.out.println("second");
        }
    }
}
