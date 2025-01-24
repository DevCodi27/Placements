package Day22_Polymorphism;

import java.util.Scanner;

public class Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        char c = sc.next().charAt(0);
        boolean isCelcious;
        if(c=='F')
        {
            isCelcious = true;
        }
        else{
            isCelcious = false;
        }
        Temp temp = new Temp();
       double ans = temp.convert(n,isCelcious);
        System.out.println(ans);
    }
}

class Temp{
    public double convert(double celsius)
    {
        double ans;
        ans = (double) 9/5*celsius+32;
        return ans;
    }

    public double convert(double fahrenheit,boolean isCelsius)
    {
        if(!isCelsius)
        {
            return convert(fahrenheit);
        }

        double ans;
        ans = (double) 5/9*(fahrenheit-32);
        return ans;
    }
}
