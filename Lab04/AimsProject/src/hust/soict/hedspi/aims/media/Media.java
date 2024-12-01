package aims.media;

import java.util.ArrayList;
import java.util.List;

public class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private int cnt = 0;
    
    
    public Media() {

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

    
}
