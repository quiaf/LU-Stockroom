public class OrderDetails {
    
    private int ProductID;
    private int OrderID;
    private int ProductQuantity;
  



public OrderDetails(int ProductID, int OrderID){
    this.ProductID = ProductID;
    this.OrderID = OrderID;
    this.ProductQuantity = ProductQuantity;
    
}
public int getProductID() {
    return ProductID;
}
public void setProductID(int productID) {
    ProductID = productID;
}
public int getOrderID() {
    return OrderID;
}
public void setOrderID(int orderID) {
    OrderID = orderID;
}

}