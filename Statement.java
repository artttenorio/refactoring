public abstract class Statement {
    public String value(Customer aCustomer) {
        String result = headerString(aCustomer);
        
        for (Enumeration rentals = aCustomer.getRentals(); rentals.hasMoreElements();) {
            Rental each = (Rental) rentals.nextElement();
            result += rentalString(each);
        }

        result += footerString(aCustomer);
        return result;
    }

    protected abstract String headerString(Customer aCustomer);
    protected abstract String rentalString(Rental aRental);
    protected abstract String footerString(Customer aCustomer);
}
