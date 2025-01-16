package Day11_Regular_Expressions;

import java.util.Scanner;

public class DuckNumber {
    public static void duckNo()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.charAt(0)!='0')
        {
            System.out.println("Ducky Number");
        }
        else
        {
            System.out.println("Not a Ducky Number");
        }
    }
}
