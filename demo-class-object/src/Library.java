public class Library {
  public static int idCount = 0;

  private int id;
  private Book[] books; // C

  public Library() {
    this.id = ++Library.idCount;
    this.books = new Book[0];
  }

  public int getId() {
    return this.id;
  }
  public void add(Book newBook) {
    Book[] newBooks = new Book[this.books.length + 1];
    for (int i = 0; i < this.books.length; i++) {
      newBooks[i] = this.books[i];
    }
    newBooks[newBooks.length]
  }

  // setLibrarian
  // public void setLibrarian(Librarian librarian) {
  // Librarian.setLibrary(this);
  // }


  // Librarian 
  // Book
  // Each Library has one librarian ONLY
  // A Library has many books
  // Library -> id
  // Book -> id

  public static void main(String[] args) {
    // Librarian findBook by library id and book id
  }
}