package Day22_Polymorphism;

public class Overriding {
    public static void main(String[] args) {
        Type type = new Type();
        type.type(35);
        type.type("Hello World");
        type.type(24.35);
    }
}

class Type{
    public void type(int a)
    {
        System.out.println(a);
    }
    public void type(double a)
    {
        System.out.println(a);
    }
    public void type(String a)
    {
        System.out.println(a);
    }
}
