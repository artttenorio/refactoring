public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private Price _price;  // Substitui o _priceCode

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);  // Atualizado para usar setPriceCode
    }

    public int getPriceCode() {
        return _price.getPriceCode();  // Delegação para o método da classe Price
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    // Outros métodos e campos da classe...
}
