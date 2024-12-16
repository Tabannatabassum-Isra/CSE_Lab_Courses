import java.util.UUID;

public class Order {
    String orderId;
    Customer customer;
    Product product;

    public Order(Customer customer, Product product) {
        this.orderId = UUID.randomUUID().toString();
        this.customer = customer;
        this.product = product;
    }
}
