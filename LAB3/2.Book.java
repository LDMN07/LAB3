package Book;

public class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;
    
    public Book() {
        this.boCode = "";
        this.boTitle = "";
        this.boAuthor = "";
    }
    
    public Book(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }
    
    public Book(Book bo) {
        this.boCode = bo.boCode;
        this.boTitle = bo.boTitle;
        this.boAuthor = bo.boAuthor;
    }
    
    public String getboCode() {
        return this.boCode;
    }
    
    public String getBoTitle() {
        return this.boTitle;
    }
    
    public String getBoAuthor() {
        return this.boAuthor;
    }
    
    public void setBoCode(String code) {
        this.boCode = code;
    }
    
    public void setBoTitle(String title) {
        this.boTitle = title;
    }
    
    public void setBoAuthor(String authorname) {
        this.boAuthor = authorname;
    }
    
    public String toString() {
        return "Book code: " + this.boCode + ", Book title: " + this.boTitle + ", Book author: " + this.boAuthor;
    }
}