/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;

  // Step 5 - 2.5.8
  // Step 8 - 2.5.8 (Changed to public)
  public static String owner = "PLTW Steven";

  public void addBook(Book b)
  {
    book = b;
  }

  public String toString() 
  {
    String info = "Current Library: " + book + " // " + movie;
    
    return info;
  }

  // Step 18
  public void testBook(Book tester) {
    tester.setTitle("New Test Title");
    System.out.println("Changed title to 'New Test Title'");
  }

  // Step 31
  public void addMovie(Movie m) {
    movie = m;
  }


  // Step 1 - 2.5.8
  public static String getOwner() {
    // Step 6 - 2.5.8
    return owner;
  }

  // Step 7 - 2.5.8
  public static void changeOwner(String o) {
    owner = o;
  }
}