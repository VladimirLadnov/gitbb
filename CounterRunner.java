package dz;

/**
 * Created by Володимир on 14.04.2016.
 */
public class CounterRunner {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new Count();
        }
        System.out.println(Count.counter);
    }
}
