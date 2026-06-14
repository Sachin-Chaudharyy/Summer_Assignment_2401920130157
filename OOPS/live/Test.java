package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        // a. Veena instance
        Veena veena = new Veena();
        veena.play();

        // b. Saxophone instance
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // c. Polymorphic reference via Playable
        Playable instrument1 = new Veena();
        instrument1.play();

        Playable instrument2 = new Saxophone();
        instrument2.play();
    }
}