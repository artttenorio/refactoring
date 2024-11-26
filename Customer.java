import java.util.Vector;
import java.util.Enumeration;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public Enumeration getRentals() {
        return _rentals.elements();
    }

    public double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    public int getTotalFrequentRenterPoints() {
        int result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }

    // Método para chamar o statement em formato texto
    public String statement() {
        return new TextStatement().value(this);
    }

    // Método para chamar o statement em formato HTML
    public String htmlStatement() {
        return new HtmlStatement().value(this);
    }
}
