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
        return width * height;

    }

    public double perimeter() {
        return (width + height) * 2;

    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);

    }

    public String toString() {
        return    "AREA = " + String.format("%.2f", area())
                + "\nPERIMETER = " + String.format("%.2f", perimeter())
                + "\nDIAGONAL = " + String.format("%.2f", diagonal());

    }

}
