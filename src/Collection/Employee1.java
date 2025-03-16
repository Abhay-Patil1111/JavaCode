package Collection;

public class Employee1 {
    private String name;

    private Double salry;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalry() {
        return salry;
    }

    public void setSalry(Double salry) {
        this.salry = salry;
    }

    int age;

    public Employee1(String name, int age, Double salry) {
        this.name = name;
        this.age = age;
        this.salry = salry;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salry=" + salry +
                '}';
    }


}
