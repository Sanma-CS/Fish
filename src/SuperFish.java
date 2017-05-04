/**
 * Created by saury on 04/05/2017.
 */
public class SuperFish {
    private String genre;
    private String name;
    //private String voice;

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre () {
        return genre;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void Voice () {
        System.out.println("how " + name + " sounds: gulugulu gulugulu");
    }
}
