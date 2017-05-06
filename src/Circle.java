/**
 * Created by saury on 07/05/2017.
 */
public class Circle extends Shape{
    private double r;
    public Circle(double r) {
        this.r = r;
    }
    public double getArea() {
        return 2*r*Math.PI;
    }
}
