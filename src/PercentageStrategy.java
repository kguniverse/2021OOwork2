public class PercentageStrategy implements IPricingStrategy {
    private int discountPercentage;

    public PercentageStrategy(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getSubTotal(SaleLineItem saleLineItem) {
        return saleLineItem.getProdSpec().getPrice() * (100 - discountPercentage) / 100;
    }
}
