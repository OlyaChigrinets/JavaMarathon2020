package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }


    public void evaluate(Student student) {
        Random random = new Random();
        int mark = random.nextInt(4) + 2;
        String markWord = "";
        switch (mark) {
            case (2):
                markWord = "неудовлетворительно";
                break;
            case (3):
                markWord = "удовлетворительно";
                break;
            case (4):
                markWord = "хорошо";
                break;
            case (5):
                markWord = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() +
                            " по предмету " + this.subject + " на оценку " + markWord);
    }


}
