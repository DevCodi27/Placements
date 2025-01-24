package Day22_Polymorphism;

import java.util.Scanner;

public class Shapes {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaOfShapes area = new AreaOfShapes();
        int r = sc.nextInt();
        double h = sc.nextDouble();
        double b = sc.nextDouble();
        int l = sc.nextInt();
        int rb = sc.nextInt();
        area.area(r);
        area.area(h,b);
        area.area(l,rb);
    }
}

class AreaOfShapes{
    public void area(int r)
    {
        double ans = 3.14*r*r;
        System.out.println("Circle area: "+ans);
    }

    public void area(double height,double breath)
    {
        double ans = (double) 1/3*height*breath;
        System.out.println("Triangle area "+ans);
    }
    public void area(int length,int breath)
    {
        int ans = length*breath;
        System.out.println("Rectangle area "+ans);
    }
}