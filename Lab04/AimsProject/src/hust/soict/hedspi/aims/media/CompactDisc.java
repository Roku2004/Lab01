package aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();
    private Disc disc;
    public CompactDisc(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track trak){
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

    public void removeTrack(Track trak){
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

    @Override
    public void play() {
        System.out.println("***********************CompactDisc***********************");
        for(Track track : tracks){
            track.play();
        }
        System.out.println("***************************************************");
    }
}
