package dz;

/**
 * Created by Володимир on 14.04.2016.
 */
public class Auto {
    private double speed;
    private boolean start;

    public void engineStart(){
        start = true;
        System.out.println("Двигун працює");
    }

    public void engineStop(){
        start = false;
        System.out.println("Двигун не заведений");
    }

    public void setSpeed(double speed) {
        this.speed = speed;
        if(start && speed > 0){
            System.out.println("Швидкість: " + speed + " км/год");
        }else if(start && speed == 0){
            System.out.println("Автомобіль стоїть");
        }else if(start){
            System.out.println("Двигун не заведений");
            System.out.println("Заведіть двигун");
        }
    }
}
