package homework_12;

public class Vehicle {

    private String name;
    private int wasteProducts;

    public Vehicle(String name, int wasteProducts) {
        this.name = name;
        this.wasteProducts = wasteProducts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWasteProducts() {
        return wasteProducts;
    }

    public void setWasteProducts(int wasteProducts) {
        this.wasteProducts = wasteProducts;
    }
}
