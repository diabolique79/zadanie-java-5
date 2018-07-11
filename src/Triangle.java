import static java.lang.Math.*;

public class Triangle {

    double a;
    double b;
    double c;
    double trianglePerimeter;


    Triangle(double a, double b, double c){

        this.a = a;
        this.b = b;
        this.c = c;
    }

    double trianglePerimeter (){

        return trianglePerimeter = a + b + c;
    }

}
