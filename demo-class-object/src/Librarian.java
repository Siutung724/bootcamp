public class Librarian { // A
  public static int idCount = 0;

  private int staffId; 
  private Library library; // B

  public Librarian() {
    this.staffId = ++Librarian.idCount;
  }

  public int getStaffId() {
    return this.staffId;
  }
  public void setLibrary(Library library) {
    this.library = library;
  }
  public Book findBook(int bookId) {
    // vaildation (null checking)
  }
  public static void main(String[] args) {
    Librarian lb1 = new Librarian();
    System.out.println(lb1.getStaffId()); // 1

    Librarian lb2 = new Librarian();
    System.out.println(lb2.getStaffId()); // 2
  }
  
}