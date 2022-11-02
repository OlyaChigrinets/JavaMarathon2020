package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBandList = new ArrayList<>();

        MusicBand musicBand1 = new MusicBand("Green day", 1997);
        MusicBand musicBand2 = new MusicBand("One Peace", 2014);
        MusicBand musicBand3 = new MusicBand("Placebo", 1985);
        MusicBand musicBand4 = new MusicBand("One direction", 1999);
        MusicBand musicBand5 = new MusicBand("Linkin Park", 2000);
        MusicBand musicBand6 = new MusicBand("Paramore", 1995);
        MusicBand musicBand7 = new MusicBand("Little BIG", 2020);
        MusicBand musicBand8 = new MusicBand("Kanye west", 1998);
        MusicBand musicBand9 = new MusicBand("Rihanna", 2010);
        MusicBand musicBand10 = new MusicBand("Drake", 2001);

        musicBandList.add(musicBand1);
        musicBandList.add(musicBand2);
        musicBandList.add(musicBand3);
        musicBandList.add(musicBand4);
        musicBandList.add(musicBand5);
        musicBandList.add(musicBand6);
        musicBandList.add(musicBand7);
        musicBandList.add(musicBand8);
        musicBandList.add(musicBand9);
        musicBandList.add(musicBand10);

        System.out.println(musicBandList);
        System.out.println(groupAfter2000(musicBandList));
    }

    public  static  List<MusicBand> groupAfter2000 (List<MusicBand>bands) {
        List<MusicBand>newBand = new ArrayList<>();
       for (MusicBand band : bands) {
           if (band.getYear() >= 2000) {
               newBand.add(band);
           }
       }
        return newBand;
    }
}
