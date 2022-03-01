import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//9 the details of the youngest male student in the Electronic department

public class YoungStudentInDepartment {
    public void print(List<Student> studentList, String department, String gender){
        Optional<Student> student= studentList.stream().filter(e -> e.getGender().equals(gender)&& e.getDept().equals(department)).min(Comparator.comparingInt(Student::getAge));
        Student s1=student.get();
        System.out.println("Youngest Student In Department: "+s1.getAge());
    }
}
