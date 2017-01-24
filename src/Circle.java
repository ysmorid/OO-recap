
/**
 * Created by ymoridza on 1/24/17.
 */
public class Circle {
    private int radius;
    private static double pi = 3.14;
    public Circle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return pi * radius * radius;
    }
}
