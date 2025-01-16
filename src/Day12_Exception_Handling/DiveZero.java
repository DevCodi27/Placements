package Day12_Exception_Handling;

import java.util.Scanner;

public class DiveZero {
    public static void zero()
    {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m= sc.nextInt();
            int ans = n/m;
            System.out.println(ans);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
