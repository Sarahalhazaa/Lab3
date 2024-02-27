import java.util.ArrayList;

public class Movie extends Media{
     private int duration;

     ArrayList<Movie> M = new ArrayList<>();

    public Movie() {
    }

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;

    }

    public void watch(User user){
        user.addtopurchasedMedia(this);

    }

    public void recommendSimilarMovies(ArrayList<Movie> M){
        String Auteur = getAuteur();
        System.out.println("Recommended similar movies directed by " + Auteur + ":");
        for (Movie movie : M) {
            if (!movie.equals(this) && movie.getAuteur().equals(Auteur)) {
                System.out.println("- " + movie.getTitle()); } }

    }

    @Override
    public String getMediaType() {
      if(duration>=120){
          return "Long Movie";
      }else return "Movie";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                ", M=" + M + super.toString()+
                '}';
    }


}
