public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("The Matrix", Movie.REGULAR);
        Movie movie2 = new Movie("Frozen", Movie.CHILDRENS);
        Movie movie3 = new Movie("Avengers: Endgame", Movie.NEW_RELEASE);

        Rental rental1 = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 4);
        Rental rental3 = new Rental(movie3, 2);

        Customer customer = new Customer("Alice");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        System.out.println(customer.statement());
    }
}
