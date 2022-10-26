package day9.Task2;

public class Triangle extends Figure{
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle(String color, int firstSide, int secondSide, int thirdSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double area() {
        return this.firstSide + this.secondSide;
    }

    @Override
    public double perimeter() {
        return this.firstSide + this.secondSide + this.thirdSide;
    }
}
