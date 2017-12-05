package java.methods;

/**
 * 方法覆盖
 * Created by luosv on 2016/10/18 0018.
 */
public class MethodOverriding {

    public static void main(String[] args) {

        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Figure fig;
        fig = f;
        System.out.println("Area is : " + fig.area());
        fig = r;
        System.out.println("Area is : " + fig.area());

    }
}

class Figure {

    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    Double area() {
        System.out.println("Inside area for figure.");
        return (dim1 * dim2);
    }

}

class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    Double area() {
        System.out.println("Inside area for rectangle.");
        return (dim1 * dim2);
    }

}
