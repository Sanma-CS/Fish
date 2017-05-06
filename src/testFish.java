/**
 * Created by saury on 04/05/2017.
 */
public class testFish {
    public static void main(String[] argvs) {
        Shape pigy = new Circle(2);
        SuperFish saury = new Saury(pigy, "boi thang");
        System.out.println(saury.getName());

    }
}

