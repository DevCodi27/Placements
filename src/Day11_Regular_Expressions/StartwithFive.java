package Day11_Regular_Expressions;

import java.util.Scanner;

public class StartwithFive {
    public static void five()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.matches("5+?-+[0-9]*"))
        {
            System.out.println("Match Found");
        }
        else {
            System.out.println("Match Not Found");
        }
    }
}
