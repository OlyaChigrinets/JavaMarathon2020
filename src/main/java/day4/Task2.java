package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];

        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        int max = 0;
        for (int arrays : array) {
            if (arrays > max)
                max = arrays;
        }
        System.out.println("Наибольший элемент массива " + max);

        int min = 10000;
        for (int arrays : array) {
            if (arrays < min)
                min = arrays;
        }
        System.out.println("Наименьший элемент массива " + min);

        int count = 0;
        for (int arrays : array) {
            if (arrays % 10 == 0)
                count++;
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0 " + count);

        int sum = 0;
        for (int arrays : array) {
            if (arrays % 10 == 0)
                sum += arrays;
        }
        System.out.println("Сумма эллементов оканчивающихся на 0 " + sum);

    }

}
