package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String>members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return name + ", " + year;
    }

    public static void transferMembers(MusicBand bandA, MusicBand bandB) {
        List<String>temp = bandA.getMembers();
        List<String>temp2 = bandB.getMembers();
        temp2.addAll(temp);
        temp.clear();
    }
    public static void printMembers(MusicBand musicBand) {
        List<String>bandMembers = musicBand.getMembers();
        System.out.println(bandMembers);
    }
}
