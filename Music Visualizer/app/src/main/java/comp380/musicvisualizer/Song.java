package comp380.musicvisualizer;

/**
 * Created by Katren on 3/3/2015.
 */
public class Song {

    private long id;
    private String title;
    private String artist;

    public Song(long sid, String songTitle, String songArtist){
        id = sid;
        title = songTitle;
        artist = songArtist;
    }

    public long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }
}
