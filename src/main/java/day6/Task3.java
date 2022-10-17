package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ирина Васильевна", "Английский язык");
        Student student = new Student("Чигринец Ольга Фёдоровна");
        teacher.evaluate(student);
    }
}
