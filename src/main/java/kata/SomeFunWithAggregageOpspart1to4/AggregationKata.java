package kata.SomeFunWithAggregageOpspart1to4;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.groupingBy;

public class AggregationKata {
    public static Map<String, Double> getAverageGradeByDepartment(Stream<Student> students) {

        return students.collect(
                groupingBy(Student::getDepartment,
                        averagingDouble(Student -> Student.getGrade())));

    }

    public static Map<String, Double> getAverageGradeByDepartmentNumber2(Stream<Student> students) {
        return students
                .collect(Collectors
                        .groupingBy(Student::getDepartment,
                        Collectors
                        .averagingDouble(Student::getGrade)));
    }
}
