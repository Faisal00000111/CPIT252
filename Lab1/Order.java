package Lab1;

public class Order {
    private Product p;
    private int orderID;
    private String orderStatus;
    
    public Order(Product p, int orderID, String orderStatus) {
        this.p = p;
        this.orderID = orderID;
        this.orderStatus = orderStatus;
    }

    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    
}
