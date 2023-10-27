package upcast;

public class Instrument {
    public void play() {
        System.out.println("played instrument");
    }

    static void tune(Instrument i) {
        i.play();
    }
}
