package basiccode;

public class Usingchararray {
    public static void main(String[] args){
        String str = "Arillya Patil";

        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length-1;
        while(left<right)
        {
            char temp = charArray [left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;

        }
        String reversed = new String(charArray);
        System.out.println("Original String:" + str);
        System.out.println("reversed String:" + reversed);
    }
}
