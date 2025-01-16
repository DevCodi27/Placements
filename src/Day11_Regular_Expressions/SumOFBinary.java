package Day11_Regular_Expressions;

import java.util.Scanner;

public class SumOFBinary {
    public static void binary()
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = Integer.toBinaryString(num);
        String s = "";
        int sum = 0;
        for(char c:str.toCharArray())
        {
            s+=c;
            int n = Integer.parseInt(s);
            sum+=n;
            s="";
        }
        if(sum%2!=0)
        {
            System.out.println("Odius Number");
        }
        else {
            System.out.println("Not a Odius Number");
        }
    }
}
