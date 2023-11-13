public class Song {
    private String title;
    private String artist;

    public Song(String t, String a) {
        title = t;
        artist = a;
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

    public String toString() {
        return "\"" + title + "\", by " + artist;
    }

    public void setArtist(String a) {
        artist = a;
    }

    public void setTitle(String t) {
        title = t;
    }
}
