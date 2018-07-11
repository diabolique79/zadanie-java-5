public class Main {

    public static void main(String[] args) {

        Square square = new Square(6.5);
        double squareArea = square.squareArea();
        System.out.println(squareArea);

        Circle circle = new Circle(2);
        double circleArea = circle.circleArea();
        System.out.println(circleArea);

        Rectangle rectangle = new Rectangle(5,2);
        double rectPerimeter = rectangle.rectPerimeter();
        System.out.println(rectPerimeter);

        Triangle triangle = new Triangle(5.2,4.8,1.2);
        double triangleArea = triangle.trianglePerimeter();
        System.out.println(triangleArea);
    }
}