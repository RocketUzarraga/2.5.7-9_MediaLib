public class MediaLibRunnerStatic {
    public static void main(String[] args) {
        // Step 1 - 2.5.8
        System.out.println(MediaLib.owner + "'s Library");

        // Step 8 - 2.5.8
        MediaLib.changeOwner("Banana Steven");
        System.out.println(MediaLib.owner + "'s Library");
    }
}
