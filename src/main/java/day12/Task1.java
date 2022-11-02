package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();
        string.add("BMW");
        string.add("AUDI");
        string.add("MERC");
        string.add("HUNDAY");
        string.add("HONDA");

        System.out.println(string);

        string.add(3, "opel");
        string.remove(0);

        System.out.println(string);
    }
}
