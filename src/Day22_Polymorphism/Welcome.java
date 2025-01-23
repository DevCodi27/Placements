package Day22_Polymorphism;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Hello hello = new Hello();
        hello.hello();
        hello.hello(str);
    }
}

class Hello{
    public void hello()
    {
        System.out.println("Hello");
    }
    public void hello(String str)
    {
        System.out.println("Hello "+str);
    }
}
