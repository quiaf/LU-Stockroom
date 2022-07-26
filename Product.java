public class Product {
    
     private int ID;
     private String Type;
     private String Manufacturer;
     private String Model;


    
    public Product (int ID, String Type, String Manufacturer, String Model){
        this.ID = ID;
        this.Type = Type;
        this.Manufacturer = Manufacturer;
        this.Model = Model;


    }



    public int getID() {
        return ID;
    }



    public void setID(int iD) {
        ID = iD;
    }



    public String getType() {
        return Type;
    }



    public void setType(String type) {
        Type = type;
    }



    public String getManufacturer() {
        return Manufacturer;
    }



    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }



    public String getModel() {
        return Model;
    }



    public void setModel(String model) {
        Model = model;
    }

   


}
