package Day22_Polymorphism;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int l = sc.nextInt();
        int b = sc.nextInt();
        AreaOfBoard area  = new AreaOfBoard();
        area.area(a);
        area.area(l,b);
    }
}

class AreaOfBoard{
    public void area(int area)
    {
        System.out.println(area*area);
    }
    public void area(int len,int bre)
    {
        System.out.println(len*bre);
    }
}