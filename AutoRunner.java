package dz;

/**
 * Created by Володимир on 15.04.2016.
 */
public class AutoRunner {
    public static void main(String[] args) {

        Auto auto = new Auto();
        auto.engineStart();
        auto.setSpeed(100);
        auto.engineStop();
        auto.setSpeed(20);
    }
}
