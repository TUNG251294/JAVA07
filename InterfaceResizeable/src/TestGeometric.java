import Geometric.Circle;
import Geometric.Rectangle;
import Geometric.Square;

public class TestGeometric {
    public static void main(String[] args) {
        Circle circleX = new Circle(5,"blue",true);
        Rectangle rectangleY = new Rectangle(4,3,"green",false);
        Square squareZ = new Square();
        squareZ.setSide(2);

        System.out.printf("%.4f%s", circleX.getArea(), "\n");
        System.out.println(circleX.toString());
        System.out.println(rectangleY.getArea());
        System.out.println(rectangleY.toString());
        System.out.println(squareZ.getArea());
        System.out.println(squareZ.toString());
    }
}