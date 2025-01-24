package Day22_Polymorphism;

import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int pocketSize = sc.nextInt();
        PerimeterofShapes perimeterofShapes = new PerimeterofShapes();
        perimeterofShapes.calculatePerimeter(length,width);
        perimeterofShapes.calculatePerimeter(pocketSize);
    }
}

class PerimeterofShapes{
    public void calculatePerimeter(int length,int width)
    {
        System.out.println((float)2*(length+width));
    }

    public void calculatePerimeter(int pocketSize)
    {
        System.out.printf("%.1f",3.14*pocketSize);
    }
}
