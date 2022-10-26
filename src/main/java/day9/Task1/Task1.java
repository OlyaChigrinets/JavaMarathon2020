package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Оля", 6514);
        Teacher teacher = new Teacher("Ирина Васильевна", "Английский");
        student.printInfo();
        teacher.printInfo();
    }
}
