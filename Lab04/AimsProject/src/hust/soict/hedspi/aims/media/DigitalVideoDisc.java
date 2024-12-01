package aims.media;
public class DigitalVideoDisc extends Media {
    private String director;
    private int length;
    public DigitalVideoDisc(){
        
    }

    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super();
        this.director = director;
        this.length = length;
    }

    public String toString() {
        return ".DVD - " +
        director + "- " +
        length + ": " ;
    }
    
}
