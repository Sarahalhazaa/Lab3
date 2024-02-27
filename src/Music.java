import java.util.ArrayList;

 class Music extends Media {
     private String artist;
     ArrayList<Music> M = new ArrayList<>();
     public Music() {
     }
     public Music(String artist) {
         this.artist = artist;
     }
     public Music(String title, String auteur, String ISBN, double price, String artist) {
         super(title, auteur, ISBN, price);
         this.artist = artist;
     }

     public String getArtist() {
         return artist;
     }

     public void setArtist(String artist) {
         this.artist = artist;
     }

     public void listen(User user) {
         user.addtopurchasedMedia(this);
     }

     public void generatePlaylist(ArrayList<Music> M) {

         ArrayList<Music> playlist = new ArrayList<>();
         for (Music music : M) {
             if (!music.equals(this) && music.getArtist().equals(artist)) {
                 playlist.add(music);
             }
         }
         System.out.println(playlist);
     }

     @Override
     public String getMediaType() {
         return getPrice() >= 10 ? "Premium Music" : "Music";
     }

     @Override
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' + super.toString()+
                '}';
    }
}
