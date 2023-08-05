package DS_practice;


import java.lang.Math;
public class P1{
    public static void main(String[] args) {
        double radius = 5;
        area1(radius);

    }
    static void area1(double radius){
        double area = Math.PI*radius*radius;
        System.out.println(area);
    }
}

