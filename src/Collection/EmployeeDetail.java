package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeDetail {
    //EmployeeDetail employeeDetail = new EmployeeDetail();






    public static void main(String[] args) {
        Employee1 employee1 = new Employee1("aditya", 24, 240000.02d);
        Employee1 employee2  = new Employee1("arvi", 23, 23000.0);
        Employee1 employee3  = new Employee1("bbb", 25, 233300d);

        int a = 10; //primitive
        Integer a2 = 10; //Object Wrapper for int
        


        List<Employee1> empList = new ArrayList<>();
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);

        //print all the emp name using streams
        Set<String> empNames = empList.stream().map(e->e.getName())
                .sorted()
                .collect(Collectors.toSet());

        System.out.println(empNames);


    }


}
