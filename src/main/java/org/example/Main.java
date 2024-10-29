package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    static ArrayList<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            studentList.add(new Student());
        }

        deleteStudents();

        for (int i = 1; i < 5; i++) {
            printStudents(studentList, i);
        }
    }

    private static void deleteStudents() {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAvgMark() < 3) {
                iterator.remove();
            } else {
                if (student.getCourse() < 4) {
                    student.setCourse(student.getCourse() + 1);
                }
            }
        }
    }

    private static void printStudents(ArrayList<Student> students, int course) {
        for (Student student : studentList) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + " - " + student.getCourse() + " курс");
            }
        }
    }
}