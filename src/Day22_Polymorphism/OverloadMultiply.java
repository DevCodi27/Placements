package Day22_Polymorphism;

import java.util.Scanner;

public class OverloadMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        Multiply multiply = new Multiply();
        multiply.mul(a,b);
        multiply.mul(c,d,e);
    }
}

class Multiply{
    public void mul(int a,int b)
    {
        System.out.println(a*b);
    }
    public void mul(int a,int b,int c)
    {
        System.out.println(a*b*c);
    }
}
