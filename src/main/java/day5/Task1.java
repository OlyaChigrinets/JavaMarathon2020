package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setYearIssue(1997);
        car.setColor("Зелёный");
        car.setModel("Mazda");

        System.out.println(car.getYearIssue());
        System.out.println(car.getColor());
        System.out.println(car.getModel());
    }
}
