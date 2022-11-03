package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicArtist artist1 = new MusicArtist("Olya", 1997);
        MusicArtist artist2 = new MusicArtist("Lera", 1998);
        List<MusicArtist>artist = new ArrayList<>();
        artist.add(artist1);
        artist.add(artist2);

        MusicBand musicBand1 = new MusicBand("Polyana", 2014, artist);

        MusicArtist artist3 = new MusicArtist("Dasha", 2000);
        MusicArtist artist4 = new MusicArtist("SAsha", 1912);
        List<MusicArtist>second = new ArrayList<>();
        second.add(artist3);
        second.add(artist4);

        MusicBand musicBand2 = new MusicBand("Sochi", 2004, second);

        MusicBand.printMembers(musicBand1);
        MusicBand.printMembers(musicBand2);

        MusicBand.transferMembers(musicBand1, musicBand2);

        MusicBand.printMembers(musicBand1);
        MusicBand.printMembers(musicBand2);
    }
}
