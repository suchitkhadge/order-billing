import java.util.List;

public class OrderProcessorClient {

    public static void main(String[] args) {

        //Initialize items for Order 1
        Item item1 = new Item(5.0f, 5.0f, 5.0f, 8.0f);
        Item item2 = new Item(10.0f, 10.0f, 10.0f, 15.0f);

        //Initialize items for Order 2
        Item item3 = new Item(5.0f, 5.0f, 5.0f, 24.0f);
        Item item4 = new Item(12.0f, 16.0f, 10.0f, 2.0f);

        //Initialize items for Order 3
        Item item5 = new Item(40.0f, 12.0f, 50.0f, 50.0f);

        //Create different orders
        Order order1 = new Order(List.of(item1, item2));
        Order order2 = new Order(List.of(item3, item4));
        Order order3 = new Order(List.of(item5));

        //Create order list
        List<Order> orders = List.of(order1, order2, order3);

        OrderProcessor orderProcessor = new OrderProcessor();

        orderProcessor.getFeesofListOfOrders(orders);


    }



}


