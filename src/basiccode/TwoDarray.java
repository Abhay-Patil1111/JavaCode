package basiccode;
import java.util.*;
public class TwoDarray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colums = sc.nextInt();
        int[][] numbers = new int[rows][colums];

        for(int i=0; i<rows; i++){
            for(int j=0;j<colums; j++){
                numbers[i][j] = sc.nextInt();

            }
        }
        for(int i =0; i<rows; i++){
            for(int j=0;j<colums; j++){
                System.out.print(numbers[i][j] + " ");

            }
            System.out.println();
        }
    }
}
