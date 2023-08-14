package entities;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public void setName(String name) {
        this.name = name;

    }

    public void setPrice(double price) {
        this.price = price;

    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }

    public String getName() {
        return name;

    }

    public double getPrice() {
        return price;

    }
    public int getQuantity() {
        return quantity;

    }


    public double getTotalValueInStock() {
        return price * quantity;

    }


    public void addProducts(int quantity) {
        this.quantity += quantity;

    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ "
                    + String.format("%.2f", price)
                    + ", "
                    + quantity
                    + " units, Total: $ "
                    + String.format("%.2f", getTotalValueInStock());

    }

}
