package LetCode;

public class Student {
    private String Name;
    private String Location;
    private int age;
    private int salry;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalry() {
        return salry;
    }

    public void setSalry(int salry) {
        this.salry = salry;
    }

    public Student
    (String name, String location, int age, int salry) {
        Name = name;
        Location = location;
        this.age = age;
        this.salry = salry;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Location='" + Location + '\'' +
                ", age=" + age +
                ", salry=" + salry +
                '}';
    }


    public int getSal() {
        return salry;

    }
}
