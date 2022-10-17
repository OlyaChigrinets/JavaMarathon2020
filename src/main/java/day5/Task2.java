package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2000, "green", "audi");
        System.out.println("Год выпуска " + motorbike.getYear() + "цвет " + motorbike.getColor() + "модель "
                + motorbike.getModel() );
    }
}
