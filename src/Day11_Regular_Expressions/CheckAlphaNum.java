package Day11_Regular_Expressions;

import java.util.Scanner;

public class CheckAlphaNum {
    public static void alphanum()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.matches("[A-Za-z0-9]+"))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
