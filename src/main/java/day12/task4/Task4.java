package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members = new ArrayList<>();
        members.add("John");
        members.add("Ola");
        members.add("Andrew");
        MusicBand musicBand = new MusicBand("Beatles", 2020, members);

        List<String>members2 = new ArrayList<>();
        members2.add("Kostya");
        members2.add("ANNA");
        MusicBand musicBand2 = new MusicBand("OLLL", 2000, members2);

        MusicBand.printMembers(musicBand);
        MusicBand.printMembers(musicBand2);


        MusicBand.transferMembers(musicBand,musicBand2);

        MusicBand.printMembers(musicBand);
        MusicBand.printMembers(musicBand2);
    }

}
