import static java.lang.Math.*;

public class Rectangle {

    double a;
    double b;
    double rectPerimeter;

    Rectangle(double a, double b){

        this.a = a;
        this.b = b;
    }

    double rectPerimeter (){

        return rectPerimeter = 2 * (a + b);
    }
}
