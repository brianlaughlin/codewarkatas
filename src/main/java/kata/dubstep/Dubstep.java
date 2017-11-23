package kata.dubstep;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Dubstep {
    public static String SongDecoder (String song)
    {
        String[] oldSong = song.split("WUB");
        StringBuilder songName = new StringBuilder();

        for(String aSong: oldSong){
            if(!aSong.equals("")) {
                songName.append(aSong);
                songName.append(" ");
            }
        }

        return songName.toString().trim();
    }

    public static String SongDecoderBest (String song)
    {
        return song.replaceAll("(WUB)+", " ").trim();
    }

    public static String SongDecoderStream(String song){

        return Arrays.stream(song.split("WUB"))
                .filter(i->!"".equals(i))
                .collect(Collectors.joining(" "));

    }



}
