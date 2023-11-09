/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  private Movie movie;

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
}