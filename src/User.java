import java.util.ArrayList;

public class User {

    private String userName;
    private String email;
    ArrayList<Media> purchasedMedia= new ArrayList<>();
    ArrayList<Media> shoppingCart= new ArrayList<>();

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchasedMedia() {
        return purchasedMedia;
    }

    public void setPurchasedMedia(ArrayList<Media> purchasedMedia) {
        this.purchasedMedia = purchasedMedia;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addToCart(Media media) {


shoppingCart.add(media);

    }

    public void removeFromCart(Media media) {
if (shoppingCart.contains(media)){
shoppingCart.remove(media);}
    }
    public void checkout() {

        if (shoppingCart.isEmpty()) {
            System.out.println("Your shopping cart is empty.");
        } else { purchasedMedia.addAll(shoppingCart);
            System.out.println("Checkout completed. Items purchased:");
            for (Media media : shoppingCart) {
                System.out.println("- " + media.getTitle()); }
            shoppingCart.clear(); } }



    public void addtopurchasedMedia(Media media){
purchasedMedia.add(media);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email +
                '}';
    }
}
