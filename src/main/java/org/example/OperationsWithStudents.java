package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class OperationsWithStudents {
    private ArrayList<Student> studentList = new ArrayList<>();

    public void start() {
        addStudents();
        deleteStudents();
        for (int i = 1; i < 5; i++) {
            printStudents(studentList, i);
        }
    }

    private void addStudents() {
        for (int i = 0; i < 15; i++) {
            studentList.add(new Student());
            System.out.println(studentList.get(i).getName() + " " + studentList.get(i).getAvgMark());
        }
        System.out.println(" ");
    }

    private void deleteStudents() {
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
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName() + " - " + student.getCourse() + " курс");
            }
        }
    }

}
