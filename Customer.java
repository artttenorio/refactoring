import java.util.Enumeration;
import java.util.Vector;


    public class Customer {
      private String name;
      private Vector<Rental> rentals = new Vector<>();
  
      public Customer(String name) {
          this.name = name;
      }
  
      public void addRental(Rental rental) {
          rentals.add(rental);
      }
  
      public String getName() {
          return name;
      }
  
      class Customer...

      public String statement() {
         Enumeration rentals = _rentals.elements();
         String result = "Rental Record for " + getName() + "\n";
         while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
   
            // show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" +
                     String.valueOf(each.getCharge()) + "\n";
         }
   
         // add footer lines
         result +=  "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
         result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) +
                        " frequent renter points";
         return result;
      }
         
      private double getTotalCharge() {
         double result = 0;
         Enumeration rentals = _rentals.elements();
         while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
            }
            return result;
      }
   
      private int getTotalFrequentRenterPoints(){
         int result = 0;
         Enumeration rentals = _rentals.elements();
         while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getFrequentRenterPoints();
         }
         return result;
      }
   
   // add footer lines
   result +=  "Amount owed is " + String.valueOf(totalAmount) + "\n";
   result += "You earned " + String.valueOf(frequentRenterPoints)
              + " frequent renter points";
   return result;
}

  
    private double amountFor(Rental aRental) {
      double amount = 0;
  
      switch (aRental.getMovie().getPriceCode()) {
          case Movie.REGULAR:
              amount += 2;
              if (aRental.getDaysRented() > 2) {
                  amount += (aRental.getDaysRented() - 2) * 1.5;
              }
              break;
          case Movie.NEW_RELEASE:
              amount += aRental.getDaysRented() * 3;
              break;
          case Movie.CHILDRENS:
              amount += 1.5;
              if (aRental.getDaysRented() > 3) {
                  amount += (aRental.getDaysRented() - 3) * 1.5;
              }
              break;
      }
  
      return amount;
  }
  
}
