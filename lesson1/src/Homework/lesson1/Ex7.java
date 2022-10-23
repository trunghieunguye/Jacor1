package Homework.lesson1;
import java.lang.Math;

public class Ex7 {
    public static void main(String[] args){
        double a=2;
        double b=3;
        double c=-1;
        double d= (b*b)-4*a*c; // d la delta
        double x1=((-b)+ Math.sqrt(d)) / (2*a);
        double x2=((-b)- Math.sqrt(d)) / (2*a);
        System.out.println("Gia tri cua nghiem thu nhat la "+ x1);
        System.out.println("Gia tri cua nghiem thu hai la "+ x2);
    }
}
