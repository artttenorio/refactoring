public abstract class Price {
    public abstract int getPriceCode();

    // Método abstrato para ser implementado pelas subclasses
    public abstract double getCharge(int daysRented);
}
