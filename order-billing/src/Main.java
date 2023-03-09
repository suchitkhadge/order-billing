import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(5.0f, 5.0f, 5.0f, 10.0f);
        Item item2 = new Item(10.0f, 10.0f, 10.0f, 20.0f);
        Order order = new Order(List.of(item1, item2));

        for (Item item : order.getItems()) {
            float serviceFee = item.getServiceFee();
            float fulfillmentFee = item.getFulfillmentFee();
            System.out.printf("Item price: %.2f, Service fee: %.2f, Fulfillment fee: %.2f%n", item.getPrice(), serviceFee, fulfillmentFee);
        }
    }
}