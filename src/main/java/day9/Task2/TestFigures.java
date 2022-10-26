package day9.Task2;

/*

Первый метод, принимая на вход массив геометрических фигур, должен вернуть
        сумму периметров красных фигур. Второй метод, принимая на вход массив
        геометрических фигур, должен вернуть сумму площадей красных фигур.
*/
public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Orange", 40, 15),
                new Rectangle("Red", 5, 10),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)};

        double perim = calculateRedPerimeter(figures);
        System.out.println("Периметр всех красных фигур: " + perim);
        System.out.println("Площадь всех красных фигур: " + calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        int count = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                count += figure.perimeter();
            }
        }

        return count;
    }

    public static double calculateRedArea(Figure[] figures) {
        int count = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                count += figure.area();
            }
        }

        return count;
    }
}
