package basiccode;

public class stringsbuilder {
    public static void main(String[] args) {
        StringBuilder ab = new StringBuilder("abhay");
        System.out.println(ab);

        System.out.println(ab.charAt(1));

        ab.setCharAt(4,'a');
        System.out.println(ab);

        ab.insert(0,'s');
        System.out.println(ab);

        System.out.println(ab.length());

    }
}

