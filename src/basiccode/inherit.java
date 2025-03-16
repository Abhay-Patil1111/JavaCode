package basiccode;

class shape{
    public void area(){
        System.out.println("Display area");
    }
}
class triangle extends shape{
    public String color;

    public void area(int l , int h){
    System.out.println(1/2*l*h);
    }
}
class equilatrealtriangle extends triangle{
    public void area(int l , int h){
        System.out.println(1/2*l*h);
    }
}
class circle extends shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class inherit {
    public static void main(String[] args) {
        triangle t1 = new triangle();
        t1.color = "white";

    }
}
