import java.util.List;
import java.util.stream.Collectors;

public class EnrolledListAfterTwentyEighteen extends StreamApi
{
    public void print(List<Student>studentList) {
        StreamApi sa=new StreamApi();
        List<String> names = studentList.stream().filter(y -> y.yearOfEnrollment >= 2018).map(Student::getName).collect(Collectors.toList());
        System.out.println(names);
    }
}
