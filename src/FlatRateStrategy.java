public class FlatRateStrategy implements IPricingStrategy{
    private double discountPerBook;

    public FlatRateStrategy(double discountPerBook) {
        this.discountPerBook = discountPerBook;
    }

    public double getSubTotal(SaleLineItem saleLineItem) {
        return saleLineItem.getProdSpec().getPrice() - discountPerBook;
    }
}
