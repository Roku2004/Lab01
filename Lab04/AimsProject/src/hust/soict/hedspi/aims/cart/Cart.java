package  aims.cart;
import java.util.ArrayList;

import aims.media.DigitalVideoDisc;
import aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED =20;
    private ArrayList<Media> itemsOrdered =new ArrayList<Media>();
    
    // public DigitalVideoDisc[] getItemsOrdered() {
    //     return itemsOrdered;
    // }
    
    //addDigitalVideoDisc lab02
    // public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    //     if (qtyOrdered < MAX_NUMBERS_ORDERED) {
    //         itemsOrdered[qtyOrdered] = disc;
    //         qtyOrdered++;
    //         System.out.println("The disc has been added.");
    //     }
    //     else {
    //         System.out.println("The cart is full.");
    //     }
    // }
    
    //addDigitalVideoDisc lab03 2.1a)
    // public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
    //     for(DigitalVideoDisc dvd : dvdList){
    //         if (qtyOrdered < MAX_NUMBERS_ORDERED){
    //             itemsOrdered[qtyOrdered] = dvd;
    //             qtyOrdered++;
    //             System.out.println("The disc has been added.");
    //         }
    //         else{
    //             System.out.println("The cart is full.");
    //         }
    //     }
    // }

    //addDigitalVideoDisc lab03 2.1b)
    // public void addDigitalVideoDisc(DigitalVideoDisc... disc){
    //     for(DigitalVideoDisc dvd : disc){
    //         if (qtyOrdered < MAX_NUMBERS_ORDERED){
    //             itemsOrdered[qtyOrdered] = dvd;
    //             qtyOrdered++;
    //             System.out.println("The disc has been added.");
    //             }
    //         else{
    //             System.out.println("The cart is full.");
    //         }
    //     }
    // }

    //addDigitalVideoDisc lab03 2.2
    // public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
    //     if(qtyOrdered < MAX_NUMBERS_ORDERED){
    //         itemsOrdered[qtyOrdered] = dvd1;
    //         qtyOrdered++;
    //         System.out.println("The disc has been added.");
    //     }
    //     else{
    //         System.out.println("The cart is full.");
    //     }

    //     if(qtyOrdered < MAX_NUMBERS_ORDERED){
    //         itemsOrdered[qtyOrdered] = dvd2;
    //         qtyOrdered++;
    //         System.out.println("The disc has been added.");
    //     }
    //     else{
    //         System.out.println("The cart is full.");
    //     }
    // }

    
    // public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
    //     boolean found = false;
    //     for (int i = 0; i < qtyOrdered; i++) {
    //         if (itemsOrdered[i] == disc) {
    //             found = true;
    //             for (int j = i; j < qtyOrdered - 1; j++) {
    //                 itemsOrdered[j] = itemsOrdered[j + 1];
    //             }
    //             itemsOrdered[qtyOrdered - 1] = null;
    //             qtyOrdered--;
    //             System.out.println("The disc " + disc.toString()+" has been removed.");
    //             break;
    //         }
    //     }
    //     if (!found) {
    //         System.out.println("The disc was not found in the cart.");
    //     }
    // }

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