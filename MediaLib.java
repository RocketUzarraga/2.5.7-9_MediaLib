/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib {
  private Book book;
  private Movie movie;
  private Song song;

  // Step 5 - 2.5.8
  // Step 9 - 2.5.8 (Changed to public)
  public static String owner = "PLTW Steven";

  // Step 12 - 2.5.8
  private static int numEntries = 0;

  // Step 28 - 2.5.8
  private static int numBooks = 0;
  private static int numMovies = 0;
  private static int numSongs = 0;

  // Step 13 - 2.5.8
  public static int getNumEntries() {
    return numEntries;
  }

  public void addBook(Book b) {
    if (book == null) {
      book = b;
      numEntries++;
      numBooks++;
    } else {
      System.out.println("Sorry bozo, only one book allowed.");
    }
  }

  public String toString() {
    String info = "Current Library: " + book + " // " + movie + " // " + song;

    return info;
  }

  // Step 18
  public void testBook(Book tester) {
    tester.setTitle("New Test Title");
    System.out.println("Changed title to 'New Test Title'");
  }

  // Step 31
  public void addMovie(Movie m) {
    if (movie == null) {
      movie = m;
      numEntries++;
      numMovies++;
    } else {
      System.out.println("Sorry bozo, only one movie allowed.");
    }
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

  // Step 25 - 2.5.8
  public void changeBook(Book b) {
    book = b;
  }

  public void changeMovie(Movie m) {
    movie = m;
  }

  // Step 27 - 2.5.8
  public void addSong(Song s) {
    if (song == null) {
      song = s;
      numEntries++;
      numSongs++;
    } else {
      System.out.println("Sorry bozo, only one song allowed.");
    }
  }

  public void changeSong(Song s) {
    song = s;
  }
}