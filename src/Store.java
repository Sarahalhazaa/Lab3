import java.util.ArrayList;

public class Store {
    ArrayList<User> U =new ArrayList<>();
    ArrayList<Media> M =new ArrayList<>();

    public Store() {
        this.U=U;
        this.M=M;
    }

    public Store(ArrayList<User> u, ArrayList<Media> m) {
        U = u;
        M = m;
    }

    public ArrayList<User> getU() {
        return U;
    }

    public void setU(ArrayList<User> u) {
        U = u;
    }

    public ArrayList<Media> getM() {
        return M;
    }

    public void setM(ArrayList<Media> m) {
        M = m;
    }
    public void addUser(User user) {
        U.add(user);
    }
    public ArrayList<User> displayUsers() {


        System.out.println("Registered Users:");
        for (User user : U) {
            return U;

        }return null;
    }

    public void addMedia(Media media) {
       M.add(media);
    }

    public ArrayList<Media> displayMedias() {

        for (Media media : M) {
            return M;
        }
        return null;
    }

    public Book searchBook(String title) {
        for (Media media : M) {
            if (media instanceof Book && media.getTitle().equalsIgnoreCase(title)) {
                return   (Book) media;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Store{" +
                "U=" + U +
                ", M=" + M +
                '}';
    }
}
