/*
 * Activity 2.5.7
 *
 * A Book class for the MediaLibrary program
 */
public class Book {
  private String title;
  private String author;
  private int rating;

  /*** Constructor ****/
  public Book(String t, String a) {
    title = t;
    author = a;
    rating = 0;

    // Step 6 - 2.5.9
    System.out.println("Adding book " + t);
  }

  /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getRating() {
    return rating;
  }

  public String toString() {
    String info = "\"" + title + "\", written by " + author;
    if (rating != 0) {
      info += ", rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void setAuthor(String a) {
    author = a;
  }

  public void adjustRating(int r) {
    if (r <= 10 && r > 0)
      rating = r;

    // Step 10 - 2.5.9
    System.out.println("Adjusting rating to " + r);
  }

  // Step 24
  public boolean equals(Book b) {
    // Step 8 - 2.5.9
    // System.out.println("Checking book " + t);

    return title.equals(b.getTitle()) && author.equals(b.getAuthor());
  }

  // // Step 3 - 2.5.9
  // public String getInfo() {
  // // Step 4 - 2.5.9
  // public String info = "\"" + title + "\", written by " + author;

  // return "The current book info is " + info;
  // }
}
