package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.info();

        Motorbike motorbike = new Motorbike(2000, "dark", "vvv");
        motorbike.info();
        int dif = motorbike.yearDifference(2022);
        System.out.println("Разница в годах " + dif);
    }
}
