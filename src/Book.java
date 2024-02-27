import java.util.ArrayList;


public class Book extends Media {
    private int quantityInStock;
    ArrayList<Review>  reviews = new ArrayList<Review>();

    public Book(String title, String auteur, String ISBN, double price, int quantityInStock) {
        super(title, auteur, ISBN, price);
        this.quantityInStock = quantityInStock;

    }
    public void addReview(Review r){
        reviews.add(r);

    }
    public double getAverageRating() {
        double sum=0;
        if (reviews.size()==0){
            return 0;
        }
        for (Review review: reviews){
            sum+=review.getRating();
        }
        return sum/reviews.size();
    }

    public void purchase(User user){
        if (quantityInStock > 0) {
            user.addtopurchasedMedia(this);
            quantityInStock--;
        } else {
            System.out.println("Sorry, " + getTitle() + " is out of stock.");
        }


    }
    public boolean isBestseller(int quantity ){
        return getAverageRating()>=4.5;

    }

    public void restock(int quantity){
        quantityInStock +=quantity;
System.out.println(quantityInStock);
    }

    @Override
    public String getMediaType() {
        if(getAverageRating()>=4.5){
            return "Bestselling Book";
        }
        return"Book";
    }

    @Override
    public String toString() {
        return "Book{" +
                "quantityInStock=" + quantityInStock +
                ", reviews=" + reviews +super.toString()+
                '}';
    }
}
