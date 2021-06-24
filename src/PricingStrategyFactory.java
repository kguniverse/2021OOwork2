public class PricingStrategyFactory {
    private PricingStrategyFactory() {
    }
    private static PricingStrategyFactory instance = new PricingStrategyFactory();

    public static PricingStrategyFactory getInstance() {
        return instance;
    }
    public IPricingStrategy getPricingStrategy(int bookType){
        if(bookType == 1){
            return new FlatRateStrategy(1);
        }
        else if(bookType == 2){
            return new PercentageStrategy(7);
        }
        else if(bookType == 3){
            return new PercentageStrategy(3);
        }
        else return new NoDiscountStrategy();

    }
}
