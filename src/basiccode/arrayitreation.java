package basiccode;

public class arrayitreation {
    public static void main(String[] args) {
        int i = 0;
        int[] numbers = {1,2,3,4,5};
        System.out.println("Itreating through numbers array:");
        for(i=0; i< numbers.length; i++){
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        System.out.println("\nItreating of array using for-each loop: ");
        for(int number : numbers){
            System.out.println("Element: " + number);
        }
    }
}
