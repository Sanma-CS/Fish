/**
 * Created by saury on 04/05/2017.
 */
public class Fish extends SuperFish {
    //............



    public static void main(String args[]) {
        Fish eg = new Fish();
        eg.setGenre("ca nuoc man");
        eg.setName("saury");
        String new_genre = eg.getGenre();
        String new_fish = eg.getName();
        System.out.println(new_fish + " la " + new_genre);
        eg.Voice();
    }
}

