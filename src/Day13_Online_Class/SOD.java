package Day13_Online_Class;

import java.util.Scanner;

public class SOD {
    public static void sod()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int sum=0;
        while (n>0)
        {
            int rem = n%10;
            sum+=rem;
            n=n/10;
        }
        int ans = sum*r;
        if(ans>10)
        {
            ans = ans%10+ans/10;
        }
        System.out.println(ans);
    }
}



