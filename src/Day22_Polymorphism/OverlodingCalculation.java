package Day22_Polymorphism;

public class OverlodingCalculation {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        calculation.cal(2);
        calculation.cal(2,5);
        calculation.cal(6.3,5.2);
    }
}

class Calculation{
    public void cal(int a)
    {
        System.out.println("Square of "+a+": "+a*a);
    }
    public void cal(int a,int b)
    {
        System.out.println("Modulus of "+a+", "+b+":"+(a%b));
    }
    public void cal(double a,double b)
    {
        System.out.println("Modulus of "+a+", "+b+":"+(a/b));
    }
}
