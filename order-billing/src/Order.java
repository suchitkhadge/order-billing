import java.util.List;

public class Order {
    private List<Item> items;

    public Order(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    public float getItemFees(Order order) {
        float feesTotal = 0;
        for (Item item : order.getItems()) {
            float serviceFee = item.getServiceFee();
            float fulfillmentFee = item.getFulfillmentFee();
            System.out.printf("Item price: %.2f, Service fee: %.2f, Fulfillment fee: %.2f%n", item.getPrice(), serviceFee, fulfillmentFee);
            feesTotal += serviceFee + fulfillmentFee;
        }
        System.out.printf("Total Fees: %.2f%n", feesTotal);
        return feesTotal;
    }

}