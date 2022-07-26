public class Order {
    
    private int ID;
    private Date Date;
    



public Order(int ID, Date Date){
    this.ID = ID;
    this.Date = Date;
    
}



public int getID() {
    return ID;
}



public void setID(int iD) {
    ID = iD;
}



public Date getDate() {
    return Date;
}



public void setDate(Date date) {
    Date = date;
}



public int getProductID() {
    return ProductID;
}



public void setProductID(int productID) {
    ProductID = productID;
}



public int getProductQuantity() {
    return ProductQuantity;
}



public void setProductQuantity(int productQuantity) {
    ProductQuantity = productQuantity;
}



public int getStoreID() {
    return StoreID;
}



public void setStoreID(int storeID) {
    StoreID = storeID;
}



}
