package Day22_Polymorphism;

import Day21_Inhertience.Main;

import java.util.Scanner;

public class Icecream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String[] strarr = str.split(" ");
        int h,r;
        if(strarr.length==2)
        {
            r=Integer.parseInt(strarr[0]);
            h = Integer.parseInt(strarr[1]);
            double ans = Quantity.quantity(r,h);
            System.out.println(ans);
        }
        else
        {
            r = Integer.parseInt(strarr[0]);
            double ans = Quantity.quantity(r);
            System.out.println(ans);
        }
    }
}

class Quantity{
    public static double quantity(int r,int h)
    {
        double ans = (double) 1 /3*3.14*r*r*h;
        return ans;
    }
    public static double quantity(int r)
    {
        double ans = ((double) 4 /3)*3.14*r*r*r;
        return ans;
    }
}
