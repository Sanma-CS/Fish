/**
 * Created by saury on 04/05/2017.
 */
public class testFish {
    public static void main(String[] argvs) {
        SuperFish new_fish = new SuperFish();
        new_fish.setName("ca heo");
        new_fish.setMovement("boi thang");
        Shape pigy_fish = new Circle(2);
        new_fish.setShape(pigy_fish);
        System.out.println(new_fish.getName() + " thi " + new_fish.getMovement());
        System.out.println(new_fish.getShape());
    }
}

