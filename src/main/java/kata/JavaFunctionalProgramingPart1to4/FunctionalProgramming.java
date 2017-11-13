package kata.JavaFunctionalProgramingPart1to4;

import java.util.function.Function;

public class FunctionalProgramming {
    public static Function<Student, Boolean> f =
            student -> "John Smith".equals(student.getFullName()) &&
                    "js123".equals(student.studentNumber);
}