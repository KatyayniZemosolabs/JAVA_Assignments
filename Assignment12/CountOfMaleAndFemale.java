/* No of male and female students */
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfMaleAndFemale {
    public void print(List<Student> studentList) {
        Map<String, List<Student>> studentGender = studentList.stream().collect(Collectors.groupingBy(Student::getGender));
        for (String key : studentGender.keySet()) {
            System.out.println("No of " + key + " is " + studentGender.get(key).size());
        }
    }
}
