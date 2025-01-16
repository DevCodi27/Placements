package Day11_Regular_Expressions;

import java.util.Scanner;

public class ISNnumber {
    public static void isn()
    {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long k = 0;
        long sum = 0;
        while(num>0)
        {
            long rem = num%10;
            sum+=rem*(++k);
            num=num/10;
        }
        if(sum%11==0)
        {
            System.out.println("ISN number");
        }
        else
        {
            System.out.println("Not a ISN number");
        }
    }
}
