package Lab_02.Problem1.PartB;

public abstract class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;

    public LibraryItem(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    @Override
    public String toString(){
        return String.format("Title: %s, Author: %s, Publication Year: %d", title, author, publicationYear);
    }
}
