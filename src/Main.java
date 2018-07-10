public class Main {

    public static void main(String[] args) {

        Square square = new Square(6.5);
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        double squareArea = shapeCalculator.squareArea(square);
        System.out.println(squareArea);

        Circle circle = new Circle(2);
        ShapeCalculator shapeCalculator1 = new ShapeCalculator();
        double circleArea = shapeCalculator.circleArea(circle);
        System.out.println(circleArea);

        Rectangle rectangle = new Rectangle(5,2);
        ShapeCalculator shapeCalculator2 = new ShapeCalculator();
        double rectPerimeter = shapeCalculator.rectPerimeter(rectangle);
        System.out.println(rectPerimeter);

        Triangle triangle = new Triangle(5.2,4.8,1.2);
        ShapeCalculator shapeCalculator3 = new ShapeCalculator();
        double triangleArea = shapeCalculator.trianglePerimeter(triangle);
        System.out.println(triangleArea);
    }
}
