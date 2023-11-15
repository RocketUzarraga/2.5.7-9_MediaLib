
/*
* Activity 2.5.9
*/
import java.util.Scanner;

public class MediaLibRunnerFinal {
    public static void main(String[] args) {
        MediaLib myLib1 = new MediaLib();
        myLib1.addBook(new Book("1984", "Orwell"));
        System.out.println("Library1:\n" + myLib1);
        System.out.println(myLib1.getUpdateDate());

        // wait a bit to get a new date
        System.out.println("Wait a second or two so Library 2 has a different time.");
        System.out.print("Press <ENTER> to continue...");
        Scanner s = new Scanner(System.in);
        String temp = s.nextLine();

        MediaLib myLib2 = new MediaLib();
        System.out.println("\nLibrary 2:");
        myLib2.addSong(new Song("Hello", "Adele"));
        System.out.println(myLib2);
        System.out.println(myLib2.getUpdateDate());

    }
}
