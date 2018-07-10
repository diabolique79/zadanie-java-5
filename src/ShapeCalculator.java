import static java.lang.Math.*;

public class ShapeCalculator {

//    double squareArea;
//    double circleArea;
//    double trianglePerimeter;
//    double rectPerimeter;

    double squareArea (Square square){

        return square.squareArea = pow(square.a, 2);
    }

    double circleArea (Circle circle) {

        return circle.circleArea = Math.round(Math.PI * pow(circle.r, 2));
    }

    double rectPerimeter (Rectangle rectangle){

        return rectangle.rectPerimeter = 2 * (rectangle.a + rectangle.b);
    }

    double trianglePerimeter (Triangle triangle){

        return triangle.triangleArea = triangle.a + triangle.b + triangle.c;
    }

}
