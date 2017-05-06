/**
 * Created by saury on 04/05/2017.
 */

public class SuperFish {
    private String name;
    private Shape shape;
    private String move;
    public static final String VOICE = "guruguru guruguru";

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setShape(Shape shape) {
        this.shape = shape;
    }
    public double getShape() {
        return shape.getArea();
    }
    public void setMovement(String move) {
        this.move = move;
    }
    public String getMovement() {
        return move;
    }
    public String sound(){
        return VOICE;
    }
}
