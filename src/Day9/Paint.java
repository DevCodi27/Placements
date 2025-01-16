package Day9;

import java.util.Scanner;

public class Paint {
    public static void cost()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        float sum1=0;
        float sum2=0;
        float input1;
        float input2;
        for(int i = 0;i<n;i++)
        {
            input1 = sc.nextFloat();
            float mul = input1*18;
            sum1+=mul;
        }
        for(int i = 0;i<m;i++)
        {
            input2 = sc.nextFloat();
            float mul = input2*12;
            sum2+=mul;
        }
        System.out.println(sum1+sum2);
    }
}
