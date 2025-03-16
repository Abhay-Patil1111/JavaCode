package basiccode;

public class arrayexampl {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        String[] names = {"ABHAY","PARTH","SAKSHI","APURVA"};

        double[]  prices;

        prices = new double[5];
        prices[0] = 20.0;
        prices[1] = 30.0;
        prices[2] = 40.0;
        prices[3] = 50.0;
        prices[4] = 60.0;

        System.out.println("First number:" + numbers[1]);
        System.out.println("First number:" + names[2]);
        System.out.println("First number:" + prices[4]);
    }
}
