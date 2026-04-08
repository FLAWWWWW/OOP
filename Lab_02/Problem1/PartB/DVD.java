package Lab_02.Problem1.PartB;

public class DVD extends LibraryItem {
    // private String title;
    // private String author;
    // private int publicationYear;
    private double rating;

    public DVD(String title, String author, int publicationYear, double rating){
        super(title, author, publicationYear);
        // this.title = title;
        // this.author = author;
        // this.publicationYear = publicationYear;
        this.rating = rating;
    }

    // public String getTitle(){
    //     return title;
    // }
    // public void setTitle(String newTitle){
    //     this.title = newTitle;
    // }

    @Override
    public String toString(){
        return String.format("***DVD info*** \n Title: %s,\n Author: %s,\n Publication Year: %d,\n Rating: %.2f", title, author, publicationYear, rating);
    }

    public boolean isRecomendedToWatch(){
        if(rating > 8.0) return true;
        return false;
    }
}
