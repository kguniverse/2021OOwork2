public class NoDiscountStrategy implements IPricingStrategy {
    public NoDiscountStrategy() {
        super();
    }

    public double getSubTotal(SaleLineItem saleLineItem) {
        return saleLineItem.getProdSpec().getPrice();
    }
}
