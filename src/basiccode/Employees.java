package basiccode;

public class Employees {
    private int empId;
    private String empCity;
    private long mobileNumber;
    private double salry;

    public Employees(int empId, String empCity, long mobileNumber, double salry) {
        this.empId = empId;
        this.empCity = empCity;
        this.mobileNumber = mobileNumber;
        this.salry = salry;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpCity() {
        return empCity;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public double getSalry() {
        return salry;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empId=" + empId +
                ", empCity='" + empCity + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", salry=" + salry +
                '}';
    }
}
