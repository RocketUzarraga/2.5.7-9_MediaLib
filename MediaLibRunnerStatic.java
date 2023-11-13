public class MediaLibRunnerStatic {
    public static void main(String[] args) {
        // Step 1 - 2.5.8
        System.out.println(MediaLib.owner + "'s Library");

        // Step 8 - 2.5.8
        MediaLib.changeOwner("Banana Steven");
        System.out.println(MediaLib.owner + "'s Library");

        // Step 14 - 2.5.8
        System.out.println(MediaLib.getNumEntries() + " entries\n");

        // Step 16 - 2.5.8
        MediaLib library = new MediaLib();
        library.addBook(new Book("Kitchen", "Banana Yoshimoto"));
        library.addMovie(new Movie("The Lorax", "Chris Renaud"));
        library.addSong(new Song("Ride on Time", "Tatsuro Yamashita"));

        // Step 17 - 2.5.8
        System.out.println(MediaLib.getNumEntries() + " entries");

        // Step 22 - 2.5.8 - Should cap out at 2 entries, but displays as 3 entries
        library.addBook(new Book("48 Laws of Power", "Robert Greene"));
        System.out.println(library);
        System.out.println(MediaLib.getNumEntries() + " entries");

        // Step 28 - 2.5.8 - Testing
        System.out.println(new Song("hi", "adle").equals(new Song("bad", "mj")));
        System.out.println(new Song("banana", "banana").equals(new Song("banana", "banana")));

    }
}
