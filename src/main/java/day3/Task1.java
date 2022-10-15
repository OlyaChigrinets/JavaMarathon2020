package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String city = scanner.nextLine();
            if (city.equalsIgnoreCase("Москва") || city.equalsIgnoreCase("Владивосток") ||city.equalsIgnoreCase("Ростов")) {
                System.out.println("Россия");
            }else if (city.equalsIgnoreCase("Рим") || city.equalsIgnoreCase("Милан") ||city.equalsIgnoreCase("Турин")) {
                System.out.println("Италия");
            } else if (city.equalsIgnoreCase("Ливерпуль") || city.equalsIgnoreCase("Манчестер") ||city.equalsIgnoreCase("Лондон"))  {
                System.out.println("Англия");
            } else if (city.equalsIgnoreCase("Берлин") || city.equalsIgnoreCase("Мюнхен") ||city.equalsIgnoreCase("Кёльн")) {
                System.out.println("Германия");
            } else if (city.equalsIgnoreCase("Stop")) {
                break;
            } else {
                System.out.println("Неизвестная страна");
            }
        }
    }
}