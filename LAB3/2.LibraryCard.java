public class LibraryCard {
    private long lbCode;
    private String owner;
    private int borrowCount;
    
    public LibraryCard() {
        lbCode = 0;
        owner = "";
        borrowCount = 0;
    }
    
    public LibraryCard(long code, String owner, int borrowCount) {
        lbCode = code;
        this.owner = owner;
        this.borrowCount = borrowCount;
    }
   
    public long getLbCode() {
        return lbCode;
    }
    
    public String getOwner() {
        return owner;
    }
    
    public int getBorrowCount() {
        return borrowCount;
    }
    
    public void setLbCode(long code) {
        lbCode = code;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public void checkOut(int num) {
        borrowCount += num;
    }
    
    public String toString() {
        return "Library Card Code: " + lbCode + "\nOwner: " + owner + "\nNumber of books borrowed: " + borrowCount;
    }
}

