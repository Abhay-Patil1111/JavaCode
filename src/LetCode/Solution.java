package LetCode;

public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            sb.insert(0, sum % 2);
            carry = sum / 2;
        }
        return sb.toString();
    }
        public static void main (String[]args){
            Solution solution = new Solution();
            String a1 = "11";
            String b1 = "1";
            System.out.println(solution.addBinary(a1,b1));

            String a2 = "1010";
            String b2 = "1011";
            System.out.println(solution.addBinary(a2,b2));

        }
    }
