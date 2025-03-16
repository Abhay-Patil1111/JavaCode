package LetCode;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeExample {
    public static void main(String[] args) {
        List<EmployeeDetail> emp = Arrays.asList(
                new EmployeeDetail("Project Engineer","Bob","Banglore",23000l,21),
                new EmployeeDetail("HR","Jin","Hydrabad",25000l,23),
                new EmployeeDetail("Executive","Hope","Pune",45000l,34)
        );
        List<EmployeeDetail> employee = emp.stream()
                .filter(e->e.getSal()>30000)
                .toList();
                        employee.forEach(System.out::println);

        System.out.println("Extracting employee names");
        List<String> empName = emp.stream()
                .map(EmployeeDetail::getName)
                .toList();
                        empName.forEach(System.out::println);

        System.out.println("Maximum salry of employee");
        Optional<EmployeeDetail> maxsal = emp.stream()
                .max((emp1, emp2)->Double.compare(emp1.getSal(),emp2.getSal()));
                maxsal.ifPresent(System.out::println);

        System.out.println("Grouping by department");
        Map<String,List<EmployeeDetail>> grpd=emp.stream()
                .collect(Collectors.groupingBy(EmployeeDetail::getDepartment));
        grpd.forEach((dept, empList) -> {
            System.out.println(dept + ":");
            empList.forEach(System.out::println);
        });

        System.out.println("summing employees salary");
        double sumsal=emp.stream()
                .mapToDouble(EmployeeDetail::getSal)
                .sum();
        System.out.println(sumsal);

        System.out.println("Grouping By Cities");
        Map<String,List<EmployeeDetail>> city1=emp.stream()
                .collect(Collectors
                        .groupingBy(EmployeeDetail::getCity));
        city1.forEach((c,l)->{
            System.out.println(c);
            l.forEach(System.out::println);

        });
        System.out.println("sorted by employee salary by ascending order");
        List<EmployeeDetail> sortedList=emp.stream()
                .sorted((emp1, emp2)->Double.compare(emp1.getSal(),emp2.getSal()))
                .toList();
        sortedList.forEach(System.out::println);

        System.out.println("sorted by employee salary by descending order");
        List<EmployeeDetail> salDescending=emp.stream()
                .sorted((emp1, emp2)->Double.compare(emp2.getSal(),emp1.getSal()))
                .toList();
        salDescending.forEach(System.out::println);
    }
}







