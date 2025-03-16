package basiccode;

import java.util.Scanner;

public class abhyareverse {

        public static void main(String args[])
        {

            String p;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a String: ");
            p=sc.nextLine();
            p=null;
            if (p != null) {
                for(int ab=p.length();ab>0;--ab)
                {
                    System.out.print(p.charAt(ab-1));
                }
            }


        }

    }


