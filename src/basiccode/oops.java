package basiccode;
class pen{
    String color;
    String type;
    public void write() {
        System.out.println("writing something");
    }
        public void printcolor(){
            System.out.println(this.color);

    }
}
class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);

    }
    Student(){
        System.out.println("Constructor called");
    }
}

public class oops {
    public static void main(String[] args) {
//        pen pen1 = new pen();
//        pen1.color = "blue";
//        pen1.type = "gel";
//
//        pen1.write();
//
//        pen pen2 = new pen();
//        pen2.color = "black";
//        pen2.type = "ball point";
//
//        pen1.printcolor();
//        pen2.printcolor();

        Student s1 = new Student();
        s1.name = "abhay";
        s1.age = 24;
        s1.printinfo();
    }
}
