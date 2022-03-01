import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//7  the number of students in each department
public class NoOfStudentsInEachDepartment {
    public void print(List<Student> studentList) {
        Map<String, List<Student>> studentDept = studentList.stream().collect(Collectors.groupingBy(Student::getDept));
        for (String key : studentDept.keySet()) {
            System.out.println("No of " + key + " students is " + studentDept.get(key).size());
        }
    }
}
