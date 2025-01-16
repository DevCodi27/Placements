package Day13_Online_Class;

import java.util.Scanner;

public class Siting {
    public static void arragement()
    {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        long mul = 1;
        for(long i = num-1;i>=1;i--)
        {
            mul*=i;
        }
        long ans = mul*2;

        System.out.println(ans);
    }
}
