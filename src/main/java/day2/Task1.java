package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int floor = scanner.nextInt();
        if(floor > 0 && floor < 5) {
            System.out.println("Малоэтажный дом");
        } else if (floor >= 5 && floor <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (floor >= 9) {
            System.out.println("Многоэтажный дом");
        } else if (floor < 0) {
            System.out.println("Ошибка ввода");
        }
    }
}