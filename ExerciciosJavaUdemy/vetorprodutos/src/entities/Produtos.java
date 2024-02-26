package entities;

public class Produtos {

    private String productName;
    private double productPrice;

    public Produtos(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Produtos() {

    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
}
