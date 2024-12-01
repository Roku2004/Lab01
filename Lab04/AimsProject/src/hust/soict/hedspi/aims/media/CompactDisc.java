package aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(){
        Track trak = new Track();
        for(Track track : tracks){
            if(trak.equals(track)){
                System.out.println("The track already exists.");
            }
            else{
                tracks.add(trak);
                System.out.println("Add track successfully.");
            }
        }
    }

    public void removeTrack(){
        Track trak = new Track();
        for(Track track : tracks){
            if(trak.equals(track)){
                tracks.remove(trak);
                System.out.println("Successfully deleted track.");
            }
            else{
                System.out.println("The track does not exist.");
            }
        }
    }
    
    public int getLength(){
        int sumLength = 0;
        for(Track track : tracks){
            sumLength += track.getLength();
        }
        return sumLength;
    }
}
