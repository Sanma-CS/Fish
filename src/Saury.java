/**
 * Created by saury on 07/05/2017.
 */
public class Saury extends SuperFish{
    public static final String NAME = "SAURY";
    public static final String VOICE = "guruguru guruguru";
    public static final String MOVE = "boi ngua";
    private double n = 0;
    private Shape shape;

    public String getName() {
        return NAME;
    }
    public String getMove() {
        return MOVE;
    }
    public String sound() {
        return VOICE;
    }
    public void setSize(double n) {
        this.n = n;
        shape = new Rectangle(n);
    }
    public double getSize() {
        return shape.getArea();
    }

    public void display() {
        System.out.println(NAME + " " + "hinh vuong, " + MOVE);
        System.out.println("size: " + getSize());
        System.out.println(NAME + "'s voice: " + sound());
    }
}
