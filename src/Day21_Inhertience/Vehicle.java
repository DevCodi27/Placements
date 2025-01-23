package Day21_Inhertience;

public class Vehicle {
    protected String type;
    Vehicle(String type)
    {
        this.type = type;
    }
    public void displayType()
    {
        System.out.println("Type: "+type);
    }
}

class Car extends Vehicle{
    private String brand;
    Car(String type,String brand)
    {
        super(type);
        this.brand = brand;
    }
    public void displayBrand()
    {
        System.out.println("Brand: "+brand);
    }
}
