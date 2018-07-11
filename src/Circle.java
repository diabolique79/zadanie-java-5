import static java.lang.Math.*;

public class Circle {

    double r;
    double circleArea;

    Circle(double r) {

        this.r = r;

    }

    double circleArea () {

        return circleArea = Math.round(Math.PI * pow(r, 2));
    }

}
