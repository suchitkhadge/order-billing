import java.util.List;

public class OrderProcessor {

    public void getFeesofListOfOrders(List<Order> orderlist){
        int ordernum = 1;
        for(Order order: orderlist){
            System.out.printf("Order number: %d%n", ordernum );
            order.getItemFees(order);
            ordernum++;
        }
    }
}
