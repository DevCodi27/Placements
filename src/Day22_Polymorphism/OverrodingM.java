package Day22_Polymorphism;

import java.util.Scanner;

public class OverrodingM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pm = sc.nextInt();
        int cm = sc.nextInt();
        Parent parent = new Parent();
        Child child = new Child();
        parent.m1();
        parent.m2(pm);
        child.m1();
        child.m2(cm);
    }
}

class Parent{
    public void m1()
    {
        System.out.println("From parent m1()");
    }
    public void m2(int a)
    {
        System.out.println(a);
    }
}

class Child extends Parent{
    @Override
    public void m1() {
        System.out.println("From child m1");
    }

    @Override
    public void m2(int a) {
        System.out.println(a);
    }
}
