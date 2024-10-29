package org.example;

import java.util.Random;

public class Student {

    private String name;
    private String group;
    private int course;
    private int markMatan;
    private int markLinal;
    private int markRusLang;
    private int markEngLang;
    private int markPE;
    private String[] nameList = {"Аркадий", "Михаил", "Глеб", "Светлана", "Мария", "Даниил", "Анна", "Наталья", "Григорий", "Людмила"};
    private String[] surnameList = {"А.", "Б.", "В.", "Г.", "Д.", "Е.", "Ё.", "Ж.", "З.", "И.", "К.", "Л.", "М.", "Н.", "О.", "П.", "Р.", "С.", "Т.", "У."};
    private float avgMark;

    Student() {
        this.name = setRandomName();
        this.group = setRandomGroup();
        this.course = setRandomCourse();
        this.markMatan = setRandomMark();
        this.markLinal = setRandomMark();
        this.markRusLang = setRandomMark();
        this.markEngLang = setRandomMark();
        this.markPE = setRandomMark();
        this.avgMark = calculateAvgMark();
    }

    private String setRandomName() {
        return nameList[new Random().nextInt(0,10)] + " " + surnameList[new Random().nextInt(0,20)];
    }

    private String setRandomGroup() {
        return "Б" + new Random().nextInt(20,24) + "-" +  new Random().nextInt(900,920);
    }

    private int setRandomCourse() {
        return new Random().nextInt(1,5);
    }

    private int setRandomMark() {
        return new Random().nextInt(2, 6);
    }

    private float calculateAvgMark() {
        return (this.markMatan + this.markLinal + this.markRusLang + this.markEngLang + this.markPE) / 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getMarkMatan() {
        return markMatan;
    }

    public void setMarkMatan(int markMatan) {
        this.markMatan = markMatan;
    }

    public int getMarkLinal() {
        return markLinal;
    }

    public void setMarkLinal(int markLinal) {
        this.markLinal = markLinal;
    }

    public int getMarkRusLang() {
        return markRusLang;
    }

    public void setMarkRusLang(int markRusLang) {
        this.markRusLang = markRusLang;
    }

    public int getMarkEngLang() {
        return markEngLang;
    }

    public void setMarkEngLang(int markEngLang) {
        this.markEngLang = markEngLang;
    }

    public int getMarkPE() {
        return markPE;
    }

    public void setMarkPE(int markPE) {
        this.markPE = markPE;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }
}
