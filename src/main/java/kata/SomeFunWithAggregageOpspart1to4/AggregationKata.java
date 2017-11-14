package kata.SomeFunWithAggregageOpspart1to4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class AggregationKata {
    public static Map<String, Double> getAverageGradeByDepartment(Stream<Student> students) {

        return students.collect(
                groupingBy(Student::getDepartment,
                        averagingDouble(Student -> Student.getGrade())));

    }

    // Get number of students by department
    public static Map<String, Long> getNumberOfStudentsByDepartment2(Stream<Student> students) {
        return students.collect(
                       groupingBy(Student::getDepartment, counting()));
    }

    //get names of the students by deparments
    public static Map<String, List<String>> getStudentNamesByDepartment3(Stream<Student> students) {

        return students.collect(
                groupingBy(Student::getDepartment,
                        mapping(Student::getName, toList()))
        );
    }

    // THE TASK: get the the number of students by gender for each department. (i.e. "CS" department has 2 males, 3 females, "Economics" department has 4 males, 5 females, etc.)
    public static Map<String, Map<Student.Gender, Long>> getTheNumberOfStudentsByGenderForEachDepartment(Stream<Student> students) {

        return students.collect(
                groupingBy(Student::getDepartment, groupingBy(Student::getGender, counting())));

    }
}
