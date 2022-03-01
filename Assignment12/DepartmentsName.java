import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class DepartmentsName extends StreamApi{
    public void print(List<Student>studentList){
        StreamApi sa = new StreamApi();
        List<String> department = studentList.stream().map(Student::getDept).distinct().collect(Collectors.toList());
        System.out.println("Departments list:"+department);
    }
}