package LetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentDetails {
    public static void main(String[] args) {
    //StudentDetails student = new StudentDetails();

        Student student = new Student("Abhay","Kolhapur",24,35000);
        Student student1 = new Student("Somesh","Latur",25,38000);
        Student student2 = new Student("jagsih","Pune",26,45000);
        Student student3 = new Student("Sai","Mumbai",27,43000);

        List<Student> studList = new ArrayList<>();
        studList.add(student);
        studList.add(student1);
        studList.add(student2);
        studList.add(student3);

        //print all the student name using streams
        Set<String> studentNames = studList.stream().map(e -> e.getName())
                .sorted()
                .collect(Collectors.toSet());
        System.out.println(studentNames);

        //print those student is salry is greater than 40000
        List<Student> studentList = studList.stream()
                .filter(e -> e.getSal() > 40000)
                .toList();
        System.out.println();

        System.out.println("summing student salary");
        int sumsal=studList.stream()
                .mapToInt(Student::getSal)
                .sum();
        System.out.println(sumsal);





    }
}
