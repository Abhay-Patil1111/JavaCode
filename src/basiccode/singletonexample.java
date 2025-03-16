package basiccode;

public class singletonexample {
    public static void main(String[] args) {
        singleton singletonInstance = singleton.getInstance();

        singletonInstance.exampleMethod();

        singleton anotherInstance = singleton.getInstance();
        System.out.println(singletonInstance = anotherInstance);
    }
}
