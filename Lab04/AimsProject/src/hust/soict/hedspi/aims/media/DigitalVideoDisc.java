package aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    private String director;
    private int length;
    private Media media;
    public DigitalVideoDisc(){
        
    }

    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, director, length);  // Gọi constructor của Disc
    }

    // Constructor với 3 tham số: title, category, cost
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost, "", 0); // Gọi constructor của Disc và truyền giá trị mặc định cho director và length
    }

    // Constructor với 1 tham số: title
    public DigitalVideoDisc(String title) {
        super(title, "", 0, "", 0); // Gọi constructor của Disc và truyền giá trị mặc định
    }
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());

    }
    
}
