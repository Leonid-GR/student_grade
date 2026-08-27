package org.example;

import java.util.ArrayList;

public class StudentGrades {

    private ArrayList<Integer> grades;

    public StudentGrades() {
        grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }
    public int getGrade(int index) {
        return grades.get(index);
    }
    public void updateGrade(int index, int newGrade) {
        grades.set(index, newGrade);
    }
    public void removeGrade(int index) {
        grades.remove(index);
    }
    public double getAverage() {
        if (grades.isEmpty()) {
            return 0;
        }

        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.size();
    }
    public void printAll() {
        System.out.println("Оценки: " + grades);
    }
}
