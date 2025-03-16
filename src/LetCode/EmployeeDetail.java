package LetCode;

public class EmployeeDetail {
    String department, name,city;
    double sal;
    int id;

    public EmployeeDetail(String department, String name, String city, double sal, int id) {
        this.department = department;
        this.name = name;
        this.city = city;
        this.sal = sal;
        this.id = id;
    }

    public EmployeeDetail() {

    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getSal() {
        return sal;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "EmployeeDetail{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", sal=" + sal +
                ", id=" + id +
                '}';
    }
}
