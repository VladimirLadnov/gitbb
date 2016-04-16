package dz;

/**
 * Created by Володимир on 14.04.2016.
 */
public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double square(){
        return Math.PI * r * r;
    }
}
