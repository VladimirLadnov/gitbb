package dz;

/**
 * Created by ��������� on 14.04.2016.
 */
public class Auto {
    private double speed;
    private boolean start;

    public void engineStart(){
        start = true;
        System.out.println("������ ������");
    }

    public void engineStop(){
        start = false;
        System.out.println("������ �� ���������");
    }

    public void setSpeed(double speed) {
        this.speed = speed;
        if(start && speed > 0){
            System.out.println("��������: " + speed + " ��/���");
        }else if(start && speed == 0){
            System.out.println("��������� �����");
        }else if(start){
            System.out.println("������ �� ���������");
            System.out.println("������� ������");
        }
    }
}