package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < 2001; i++) {
            stringBuilder.append(i).append(" ");
        }
        System.out.println(stringBuilder);
    }
}
