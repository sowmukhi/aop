package com.neoteric.StudentReportCardGenerator;

import java.util.List;

public class Student {
    private String name;
    private List<Integer> marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public double getAverage() {
        if (marks.isEmpty()) return 0.0;

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / (double) marks.size();
    }
}
