package Day22_Polymorphism;

import java.util.Scanner;

public class OverloadinMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Overloading.fun1(a,b);

        } else if (n==3) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            Overloading.fun1(a,b,c);
        }
        else {
            System.out.println("WRONG INPUT");
        }
    }
}
class Overloading{
    public static void fun1(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void fun1(int a,int b)
    {
        System.out.println(a+b);
    }
}
