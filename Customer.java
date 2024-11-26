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
  
      public String statement() {
          double totalAmount = 0;
          int frequentRenterPoints = 0;
          StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n");
  
          for (Rental rental : rentals) {
              // Substituímos a chamada para amountFor pelo método getCharge
              double thisAmount = rental.getCharge();
  
              // Adiciona pontos de aluguel frequente
              frequentRenterPoints++;
              if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE && rental.getDaysRented() > 1) {
                  frequentRenterPoints++;
              }
  
              // Adiciona detalhes do aluguel ao relatório
              result.append(String.format("\t%s\t%.2f\n", rental.getMovie().getTitle(), thisAmount));
              totalAmount += thisAmount;
          }
  
          // Adiciona os totais ao final do relatório
          result.append(String.format("Amount owed is %.2f\n", totalAmount));
          result.append(String.format("You earned %d frequent renter points", frequentRenterPoints));
  
          return result.toString();
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
