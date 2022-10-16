import Geometric.Rectangle;
import Geometric.Square;

public class TestInterface {
    public static void main(String[] args){
        Rectangle rectangleR = new Rectangle(4,6);
        System.out.println(rectangleR.toString());
        System.out.println(rectangleR.reSize());

        Square squareS = new Square(2);
        System.out.println(squareS.toString());
        System.out.println(squareS.reSize());
    }
}
