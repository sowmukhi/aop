package com.neoteric.functionalPgm;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Student {
    private String name;
    private int id;
    private int marks;

    public Student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    //function to check if the student has passed or not

    Predicate<Student> hasPassed= student->student.getMarks()>=40;

    // Function to get student name in uppercase
    Function<Student,String> nameToUpperCase = student->student.getName().toUpperCase();


    // Function to get grade based on marks

    Function<Student,String> getGrade = student  ->{

        int m=student.getMarks();
        if(m>=90) return "A";
        else if(m>=75) return "B";
        else if(m>=60) return "C";
        else if(m>=40) return "D";
        else return "Fail";


    };


    Supplier<Student> studentSupplier = ()->new Student("qqqq",123,90);
    public Consumer<Student> studentPrinter = s->{

        System.out.println("Id: "+s.getId());
        System.out.println("Name: "+s.getName());
        System.out.println("Marks: "+s.getMarks());

    };


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marks=" + marks +

                '}';
    }
}