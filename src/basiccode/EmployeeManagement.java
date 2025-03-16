package basiccode;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employees> employeesList = new ArrayList<>();

        employeesList.add(new Employees(101, "Banglore", 9988776655l, 25000));
        employeesList.add(new Employees(102, "Hydrabad", 8766583757l, 24000));
        employeesList.add(new Employees(103, "Pune", 5656756434l, 34000));

        System.out.println("EmployeeDetails");
        for (Employees emp : employeesList) {
            System.out.println(emp);
        }
    }
}

//        int searchId = 102;
//        Employees foundEmployee = searchById(employeesList,searchId);
//        if (foundEmployee != null){
//            System.out.println("\nEmployee Found with ID " + searchId + ":");
//            System.out.println(foundEmployee);
//        }else{
//            System.out.println("\nEmployee with ID " + searchId + " not found.");
//        }
//        public static Employees searchById(List<Employees> employeesList, int empId) {
//            for (Employees emp : employeesList) {
//                if (emp.getEmpId() == empId) {
//
//                }
//            }
//
//    }

