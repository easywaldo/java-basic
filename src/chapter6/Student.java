package chapter6;

import java.util.ArrayList;

public class Student {
    int id;
    String name;
    ArrayList<Subject> subject;

    public Student(int id, String name, ArrayList<Subject> subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public void showInfo() {
        System.out.println(String.format("id : %d, name: %s", id, name));
        for (Subject item :subject) {
            System.out.println(String.format("subject title : %s,  score : %d", item.title, item.score));
        }
    }

}