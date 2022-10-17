package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Java", 12, 345, 1234);

        airplane.setYear(22);
        airplane.setLength(678);
        airplane.fillUp(12);
        airplane.fillUp(45);
        airplane.info();
    }
}
