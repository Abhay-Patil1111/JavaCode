package basiccode;

public class reverses {
    public static void main(String[] args) {
      StringBuilder ab = new StringBuilder("abhay");

      for(int i = 0; i<ab.length()/2; i++){
        int front = i;
        int back = ab.length() - 1 - i;

        char frontchar = ab.charAt(front);
        char backchar = ab.charAt(back);

        ab.setCharAt(front,backchar);
        ab.setCharAt(back,frontchar);

        System.out.println(ab);
      }
    }
}
