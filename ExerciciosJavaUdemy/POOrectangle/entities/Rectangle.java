package entities;

public class Rectangle {

    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;

    }

    public void setHeight(double height) {
        this.height = height;

    }

    public double getWidth() {
        return width;

    }

    public double getHeight() {
        return height;

    }

    public double area() {
        return getWidth() * getHeight();

    }

    public double perimeter() {
        return (getWidth() + getHeight()) * 2;

    }

    public double diagonal() {
        return Math.sqrt(getWidth() * getWidth() + getHeight() * getHeight());

    }
}
