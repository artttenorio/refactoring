import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Criando filmes
        Movie movie1 = new Movie("The Lion King", Movie.CHILDRENS);
        Movie movie2 = new Movie("Inception", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("The Godfather", Movie.REGULAR);

        // Criando locações
        Rental rental1 = new Rental(movie1, 4);
        Rental rental2 = new Rental(movie2, 2);
        Rental rental3 = new Rental(movie3, 5);

        // Criando cliente e adicionando locações
        Customer customer = new Customer("John Doe");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        // Gerando e imprimindo o relatório
        System.out.println(customer.statement());
    }
}
