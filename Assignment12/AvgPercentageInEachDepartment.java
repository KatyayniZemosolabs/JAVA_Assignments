import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//the average percentage achieved in each department
public class AvgPercentageInEachDepartment {
    public void print(List<Student> studentList){
        Map<String, Double> avgPercentageOfDepartments=
                studentList.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.averagingDouble(Student::getPerTillDate)));
        for (String s:avgPercentageOfDepartments.keySet()){
            System.out.println(s+" "+avgPercentageOfDepartments.get(s));
        }
    }
}
