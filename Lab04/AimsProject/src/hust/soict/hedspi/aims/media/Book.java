package aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book() {

    }

    public Book(List<String> authors) {
        this.authors = authors;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String authorName){
        for(String author : authors){
            if(authorName.equalsIgnoreCase(author)){
                System.out.println("The author already exists.");
            }
            else{
                authors.add(authorName);
                System.out.println("Add author successfully.");
            }
        }
    }

    public void removeAuthor(String authorName){
        for(String author : authors){
            if(authorName.equalsIgnoreCase(author)){
                authors.remove(authorName);
                System.out.println("Successfully deleted author.");
            }
            else{
                System.out.println("Author does not exist.");
            }
        }
    }
}
