/**
 * Created by saury on 07/05/2017.
 */
public class Rectangle extends Shape {
    private double n;

    public Rectangle(double n) {
        this.n = n;
    }
    public double getArea() {
        return 4*n;
    }
}
