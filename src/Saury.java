/**
 * Created by saury on 07/05/2017.
 */
public class Saury extends SuperFish{
    public static final String NAME = "SAURY";
    public static final String VOICE = "guruguru guruguru";

    public Saury(Shape shape, String move) {
        super(NAME,shape,move);
        display(getShape(), getMove());
    }
    public String sound() {
        return VOICE;
    }
    public void display(Shape shape, String move) {
        System.out.println(NAME + " " + move);
        System.out.println("Shape: " + shape.getArea());
        System.out.println(NAME + "'s voice: " + sound());
    }
}
