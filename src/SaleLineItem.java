public class SaleLineItem {
    private int copies;
    private ProductSpecification prodSpec;
    private IPricingStrategy strategy;

    public SaleLineItem(ProductSpecification prodSpec, int copies) {
        this.prodSpec = prodSpec;
        this.copies = copies;
        strategy = PricingStrategyFactory.getInstance().getPricingStrategy(prodSpec.getType());
    }

    public double getSubtotal() {
        return strategy.getSubTotal(this) * copies;
    }

    public ProductSpecification getProdSpec() {
        return prodSpec;
    }
}
