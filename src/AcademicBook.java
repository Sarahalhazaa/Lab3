import java.util.ArrayList;

public class AcademicBook extends Book{
    private String subject;

    public AcademicBook(String title, String auteur, String ISBN, double price, int quantityInStock, String subject) {
        super(title, auteur, ISBN, price, quantityInStock);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getMediaType() {
        if (getAverageRating()>= 4.5){
            return "Bestselling AcademicBook";
        }else return "AcademicBook";
    }

    @Override
    public String toString() {
        return "AcademicBook{" +
                "subject='" + subject + '\'' +super.toString()+
                '}';
    }
}
