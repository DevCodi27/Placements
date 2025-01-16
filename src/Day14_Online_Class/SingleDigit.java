package Day14_Online_Class;

import java.util.Scanner;

public class SingleDigit {
    public static void sd()
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n>0)
        {
            int rem = n%10;
            sum+=rem;
            n=n/10;
        }
        if(sum>=10)
        {
            int a;
            int b;
            a=sum/10;
            b =sum%10;
            System.out.println(a+b);
        }
        else
        {
            System.out.println(sum);
        }
    }

}
