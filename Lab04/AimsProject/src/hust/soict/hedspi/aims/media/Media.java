package aims.media;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private int nbDigitalVideoDisc = 0;
    
    
    public Media() {

    }

    public Media(String title, String category, float cost) {
        this.id =++ nbDigitalVideoDisc;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }



    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }


    public float getCost() {
        return cost;
    }


    public void setCost(float cost) {
        this.cost = cost;
    }

    public String toString(){
        return id + ".DVD - " +
        title + " - " +
        category+ "- " +
        cost + "$";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Media media = (Media) obj;
        return title.equals(media.title);
    }

}
