public class User {
    
    private int DNI;
    private String FirstName;
    private String LastName;
    private int StoreID;



public User(int DNI, String FirstName, String LastName, int StoreID){
    this.DNI = DNI;
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.StoreID = StoreID;

}


public int getDNI() {
    return DNI;
}



public void setDNI(int dNI) {
    DNI = dNI;
}



public String getFirstName() {
    return FirstName;
}



public void setFirstName(String firstName) {
    FirstName = firstName;
}



public String getLastName() {
    return LastName;
}



public void setLastName(String lastName) {
    LastName = lastName;
}



public int getStoreID() {
    return StoreID;
}



public void setStoreID(int storeID) {
    StoreID = storeID;
}



}