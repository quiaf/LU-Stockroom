public class Store {
    
    private int ID;
    private String address;
    private String province;
    private String city;

}

public Store(int ID, String address, String province, String city) {
    this.ID = ID;
    this.address = address;
    this.province = province;
    this.city = city;
}

public int getID() {
    return ID;
}

public void setID(int iD) {
    ID = iD;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

public String getProvince() {
    return province;
}

public void setProvince(String province) {
    this.province = province;
}

public String getCity() {
    return city;
}

public void setCity(String city) {
    this.city = city;
}
