package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if (x >= 5){
            double result = (Math.pow(x, 2) - 10) / (x + 7);
            System.out.println(result);
        } else if (x > -3 && x <5) {
            double result = (x + 3) * (Math.pow(x, 2) - 2);
            System.out.println(result);
        } else {
            System.out.println("420");
        }
    }
}
