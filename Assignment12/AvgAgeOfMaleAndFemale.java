import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgAgeOfMaleAndFemale {
    public void print(List<Student> studentList){
        Map<String, Double> avgAgeOfMaleAndFemaleEmployees=studentList.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        System.out.println("Average of male and female is: " + avgAgeOfMaleAndFemaleEmployees);
    }
}
