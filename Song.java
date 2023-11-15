public class Song {
    private String title;
    private String artist;
    private int rating;

    public Song(String t, String a) {
        title = t;
        artist = a;
        rating = 0;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public boolean equals(Song s) {
        return title.equals(s.getTitle()) && artist.equals(s.getArtist());
    }

    public void adjustRating(int r) {
        if (r <= 10 && r > 0)
            rating = r;
    }

    public String toString() {
        String info = "\"" + title + "\", by " + artist;
        if (rating != 0) {
            info += ", rating is " + rating;
        }
        return info;
    }

    public void setArtist(String a) {
        artist = a;
    }

    public void setTitle(String t) {
        title = t;
    }
}
