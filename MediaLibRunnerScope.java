/*
 * Activity 2.5.9
 */
public class MediaLibRunnerScope {
  public static void main(String[] args) {
    MediaLib myLib = new MediaLib();
    myLib.addMovie(new Movie("Raiders of the Lost Ark", "Steven Spielberg"));
    myLib.addBook(new Book("1984", "George Orwell"));
    myLib.addSong(new Song("Hello", "Adele"));
    System.out.println(MediaLib.getOwner() + "'s Library:\n" + myLib);
  }
}