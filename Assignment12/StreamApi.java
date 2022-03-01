import  java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;


public class StreamApi {

    //3. the details of all male student in the computer sci department
    public List<Student> getAllMaleInDepartment(List<Student>studentList,String department){
        return studentList.stream().filter(p -> p.getGender().equals("Male") && p.getDept().equals(department)).collect(Collectors.toList());
    }

    //6  the details of the highest student having the highest percentage
    public void getStudentOfHighPercentage(List<Student>studentList){
        Optional<Student> student= studentList.stream().max(Comparator.comparingDouble(Student::getPerTillDate));
        Student s1=student.get();
        System.out.println("Youngest Student In Department: " + s1.getAge());
    }

    // 10.male and female in cse
    public void noOfMaleAndFemaleInDepartment(List<Student> studentList,String department) {
        Map<String, List<Student>> studentGender1 = studentList.stream().filter(d -> d.getDept().equals(department)).collect(Collectors.groupingBy(Student::getGender));
        for (String key : studentGender1.keySet()) {
            System.out.println("No of " + key + " in cse is " + studentGender1.get(key).size());
        }
    }
}
