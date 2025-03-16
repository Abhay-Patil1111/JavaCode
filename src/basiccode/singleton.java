package basiccode;

public class singleton {
    public static void main(String[] args) {

    }
    private static singleton instance;
    private singleton(){

    }
    public static singleton getInstance(){
        if(instance==null){
            instance=new singleton();
        }
        return instance;

    }
    public void exampleMethod(){
        System.out.println("This is an example method singleton class");
    }
}
