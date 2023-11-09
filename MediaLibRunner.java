/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    Book myBook = new Book("The Lord of the Rings", "Tolkien");
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    System.out.println("Book created: " + myBook);
    myLib.addBook(myBook);
    System.out.println(myLib);
    // Step 8
    int myRating = -1;
    myBook.adjustRating(myRating);
    System.out.println(myBook);
    // Step 9
    System.out.println(myRating);

    // Step 12
    myBook.setTitle("Steven Bad");
    System.out.println("Book: " + myBook);
    System.out.println(myLib);

    // Step 15
    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();
    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    System.out.println(myLib2);

    // Step 20
    System.out.println("\nOld title: " + newBook);
    myLib.testBook(newBook);
    System.out.println("New title: " + newBook);

    // Step 25
    Book newBook2 = new Book("New Test Title", "Orwell");
    System.out.println("Books same? " + newBook.equals(newBook2));
    newBook.setTitle("Banana");
    System.out.println("Books same? " + newBook.equals(newBook2));

    // Step 27-28 : produces error
    // System.out.println(newBook2.title);


    // Step 32
    Movie newMovie = new Movie("Inception", "Nolan");
    Movie newMovie2 = new Movie("Oppenheimer", "Nolan");
    System.out.println("Movies same? " + newMovie.equals(newMovie2));
    myLib.addMovie(newMovie);
    System.out.println(myLib);

  }
}