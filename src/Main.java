import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


//-----------------------------Book------------------------------------------------------

        Book book1 = new Book("Book1", "Yara", "978074", 50.99, 1);
        Book book2 = new Book("Book2", "Sara", "978006", 19.49, 8);

//----------------------------Movie------------------------------------------------------

        Movie movie1 = new Movie("Movie1", "Nasser", "978079", 14.99, 148);
        Movie movie2 = new Movie("Movie2", "fahad", "098764", 14.99, 130);

//----------------------------Music------------------------------------------------------
        ArrayList<Music> music = new ArrayList<>();
        Music music1 = new Music("Music1", "Mohammed", "9780739", 8.99, "Nawaf");
        Music music2 = new Music("Music2", "Mohammed", "96766e6", 8.99, "Nawaf");
        music.add(music1);
        System.out.println("");
        System.out.print("Generate Playlist To musics : ");
        music2.generatePlaylist(music);
        System.out.println("");
//----------------------------Novel------------------------------------------------------

        Novel novel1 = new Novel("Novel1", "Sara", "978006", 19.49, 8,"A");

//----------------------------AcademicBook------------------------------------------------------

        AcademicBook academicBook1 = new AcademicBook("AcademicBook1", "Sara", "978006", 19.49, 8,"A");


//----------------------------Store------------------------------------------------------

        Store store1 = new Store();
        store1.addMedia(book1);
        store1.addMedia(book2);
        store1.addMedia(movie1);
        store1.addMedia(music1);
        store1.addMedia(novel1);
        store1.addMedia(academicBook1);
        System.out.println("Available Media: ");
        for (Media media : store1.displayMedias()) {
            System.out.println(media.getTitle());
        }
        System.out.println("");
        System.out.println("Searching for the book 'Book1':");
        Book foundBook = store1.searchBook("Book1");
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook.getTitle());
        } else {
            System.out.println("Book not found.");
        }
        System.out.println("");

        //----------------------------User------------------------------------------------------

        User user2 = new User("user2", "user1@gmail.com");
        user2.addToCart(book1);
        User user1 = new User("user1", "user2@gmail.com");
        user1.addToCart(book1);
        user1.addToCart(movie1);
        user1.addToCart(novel1 );
        System.out.println("User1 Shopping Cart:");
        for (Media media : user1.getShoppingCart()) {
            System.out.println(media.getTitle());
        }
        System.out.println("");

        user1.removeFromCart(novel1);

        System.out.println("Items Purchased by " + user1.getUserName() + ":");
        user1.checkout();
        System.out.println("");

        store1.addUser(user1);
        store1.addUser(user2);
        System.out.println(store1.displayUsers());
        System.out.println("");
//----------------------------Review------------------------------------------------------
        Review review1 = new Review("user1", 4.5, "Good book!");
        book1.addReview(review1);
        Review review2 = new Review("user2", 5.0, "Amazing!");
        book1.addReview(review2);

        System.out.println("Average Rating for " + book1.getTitle() + ": " + book1.getAverageRating());

    }
}