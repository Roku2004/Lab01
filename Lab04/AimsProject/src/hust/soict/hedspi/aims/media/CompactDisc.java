package aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public CompactDisc(int i, String string, String string2, float f, String string3) {
        
    }

    public CompactDisc(String title, String category, float cost, String artist) {
        super(title, category, cost, "", 0); // Gọi constructor của Disc, truyền giá trị mặc định cho length và director
        this.artist = artist;
        this.tracks = new ArrayList<>(); // Khởi tạo danh sách tracks
    }

    public CompactDisc(int nextId, String title) {
        //TODO Auto-generated constructor stub
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track){
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Add track successfully.");
        } else {
            System.out.println("The track already exists.");
        }
    }

    public void removeTrack(Track track){
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Successfully deleted track.");
        } else {
            System.out.println("The track does not exist.");
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
