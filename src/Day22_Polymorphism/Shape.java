package Day22_Polymorphism;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        Area area = new Rectangle();
        area.calculateArea(a,b);
    }
}
class Area{
    float l;
    float b;
    public void calculateArea(float l,float b)
    {
        this.l = l;
        this.b= b;
    }
}

class Rectangle extends Area{
    @Override
    public void calculateArea(float l,float b) {
        float area = l*b;
        System.out.println(area);
    }
}
