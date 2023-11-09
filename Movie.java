public class Movie {
    private String title;
    private int rating;
    private String director;

    public Movie(String t, String d) {
        title = t;
        rating = 0;
        director = d;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String d) {
        director = d;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void adjustRating(int r) {
        if (r <= 10 && r > 0)
            rating = r;
    }

    public String toString() {
        String info = "\"" + title + "\", directed by " + director;
        if (rating != 0) { 
            info += ", rating is " + rating;
        }   
        return info;
    }

    public boolean equals(Movie m) {
        return title.equals(m.getTitle()) && director.equals(m.getDirector());
    } 
}
