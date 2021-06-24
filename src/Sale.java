import java.util.ArrayList;

public class Sale {
    private ArrayList<SaleLineItem> items;

    public Sale() {
        this.items = new ArrayList<>();
    }
    public void add(ProductSpecification prodSpec, int copies){
        SaleLineItem item = new SaleLineItem(prodSpec, copies);
        items.add(item);
    }
    public double getTotal(){
        double total = 0;
        for(SaleLineItem item : items) total += item.getSubtotal();
        return total;
    }
}
