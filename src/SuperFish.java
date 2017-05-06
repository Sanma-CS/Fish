/**
 * Created by saury on 04/05/2017.
 */

public abstract class SuperFish {
    private String name;
    private Shape shape;
    private String move;

    public SuperFish(String name, Shape shape, String move) {
        this.name = name;
        this.shape = shape;
        this.move = move;
    }

    public String getName() {
        return name;
    }
    public Shape getShape() {
        return shape;
    }
    public String getMove() {
        return move;
    }

    public abstract String sound();
}
