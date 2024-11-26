public class NewReleasePrice extends Price {
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2: 1;
    }
    }

