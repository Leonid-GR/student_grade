package org.example;

public class Main {

    public static void main(String[] args) {

        StudentGrades student = new StudentGrades();

        student.addGrade(12);
        student.addGrade(10);
        student.addGrade(9);
        student.addGrade(11);

        student.printAll();

        System.out.println("Grade index 2: " + student.getGrade(2));

        student.updateGrade(1, 8);
        student.printAll();

        student.removeGrade(0);
        student.printAll();

        System.out.println("AVG: " + student.getAverage());
    }
}
