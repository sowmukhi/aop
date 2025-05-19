package com.neoteric.StudentReportCardGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", Arrays.asList(60, 70, 80)),
                new Student("Bob", Arrays.asList(30, 40, 20)),
                new Student("Charlie", Arrays.asList(50, 60, 45)),
                new Student("David", Arrays.asList(90, 85, 95))
        );

        // Predicate to check if student passed
        Predicate<Student> isPassed = s -> s.getAverage() >= 40;

        // Function to convert student to report line
        Function<Student, String> toReport = s ->
                String.format("%s - Average: %.2f", s.getName(), s.getAverage());

        // Filter passed students manually
        List<Student> passedStudents = new ArrayList<>();
        for (Student s : students) {
            if (isPassed.test(s)) {
                passedStudents.add(s);
            }
        }

        // Sort passed students by average descending
       // passedStudents.sort((s1, s2) -> Double.compare(s2.getAverage(), s1.getAverage()));

        // Print report
        System.out.println("=== Passed Students Report ===");
        for (Student s : passedStudents) {
            System.out.println(toReport.apply(s));
        }
    }
}
