package  aims.cart;
import java.util.ArrayList;

import aims.media.DigitalVideoDisc;
import aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED =20;
    private ArrayList<Media> itemsOrdered =new ArrayList<Media>();

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            if (media != null) {
                total += media.getCost();
            }
        }
        return total;
    }
    
    //print the list of ordered items of a cart
    public void PrintCart(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:\n");
        float cost = 0;
        for(Media media : itemsOrdered){
            try {
                System.out.println(media.toString());
                cost += media.getCost();
            } catch (NullPointerException e) {
            }
        }
        System.out.println("Total cost: " + cost);
        System.out.println("***************************************************");
    }

    public void SearchById(int id){
        boolean found = false;
        try {
        for(Media media : itemsOrdered){
            if(media.getId() == id){
                System.out.println("Found by id " + id + ": " + media.toString());
                found = true;
                break;
            }
        }
        } catch (NullPointerException e) {
        }
            if(!found){
                System.out.println("No DVD found with by " + id);
            }
    }

    public void SearchBytitle(String title){
        boolean found = false;
            try {
            for(Media media : itemsOrdered){
            if(media.getTitle() == title){
                    System.out.println("Found by title " + title + ": " + media.toString());
                    found = true;
                    break;
                }
            }
            } catch (NullPointerException e) {
            }
            if(!found){
                System.out.println("No DVD found with by " + title);
            }
        }
    
    public void addMedia(Media Media){
        for(Media media : itemsOrdered){
            if(Media.equals(media)){
                System.out.println("The media already exists.");
            }
            else{
                itemsOrdered.add(Media);
                System.out.println("Add media successfully.");
            }
        }
    }

    public void removeMedia(Media Media){
        for(Media media : itemsOrdered){
            if(Media.equals(media)){
                itemsOrdered.remove(Media);
                System.out.println("Successfully deleted media .");
            }
            else{
                System.out.println("The media does not exist.");
            }
        }
    }
}