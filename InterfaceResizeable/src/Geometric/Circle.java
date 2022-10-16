package Geometric;

import Resizeable.Resizeable;

public class Circle extends Geometric implements Resizeable {
    private double radius = 1.0;
    private String color = "Red";
    private boolean filled = true;
    public Circle(){
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public double getRadius() {
        return radius;
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
        return Math.pow(getArea()*(Math.random()*100+1),2);
    }
    @Override
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", " + isFilled();
    }
}
