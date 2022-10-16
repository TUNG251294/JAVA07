package Geometric;

public class Square extends Rectangle{
    private double side = 1.0;
    public Square(){
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super (side, side, color, filled);
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public String toString(){
        return "Square is a " + super.toString();
    }
}
