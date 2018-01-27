class Product {
    private String name;
    private double price;
    private boolean available;
    private String colour;
    private int quantity;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setAvailable (boolean available) {
        this.available = available;
    }

    public boolean isAvailable () {
        return available;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    Product() {
        name = "None";
        price = 0.0;
        available = false;
        colour = "None";
        quantity = 0;
    }
    Product(String prName, double prPrice, boolean prAvailable, String prColour, int prQuantity) {
        name = prName;
        price = prPrice;
        available = prAvailable;
        colour = prColour;
        quantity = prQuantity;
    }
}
