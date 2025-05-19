package com.neoteric.functionalPgm;

public class testStudent {
    public static void main(String[] args) {
        Student s= new Student("nnnn",1233,70);
        System.out.println("Name: "+ s.nameToUpperCase.apply(s));
        System.out.println("Passed: "+s.hasPassed.test(s));
        System.out.println("Grade: "+s.getGrade.apply(s));
        System.out.println("StudentDetails: "+s.studentSupplier.get());
        Student s12 = new Student("fff", 123445, 80);
        System.out.println("Student Details:");
        s.studentPrinter.accept(s12);
    }
}
