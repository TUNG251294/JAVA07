package Geometric;
import Resizeable.Resizeable;
public class Rectangle extends Geometric implements Resizeable{
    private double width = 1.0;
    private double height = 1.0;
    private String color = "Red";
    private boolean filled = true;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public double reSize(){
        return Math.pow(getArea()*(Math.random()*100 + 1),2);
    }
    @Override
    public double getArea(){
        return this.width*this.height;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", " + isFilled() +"}";
    }
}
