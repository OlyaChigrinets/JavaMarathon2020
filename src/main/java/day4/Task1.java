package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();

        System.out.println("Введено число " + numb + ". " + "Сгенерирован следующий массив:");

        int[] array = new int[numb];

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10);

        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);

        int count = 0;
        for (int n : array) {
            if (n > 8)
                count++;
        }
        System.out.println("Количество чисел больше 8: " + count);

        int count1 = 0;
        for (int n : array) {
            if (n == 1)
                count1++;
        }
        System.out.println("Количество чисел равных 1: " + count1);

        int count2 = 0;
        for (int n : array) {
            if (n % 2 == 0)
                count2++;
        }
        System.out.println("Количество четных чисел : " + count2);

        int count3 = 0;
        for (int n : array) {
            if (n % 2 != 0)
                count3++;
        }
        System.out.println("Количество нечетных чисел : " + count3);

        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];

        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
