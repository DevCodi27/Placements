package Day11_Regular_Expressions;

import java.util.Scanner;

public class AlphaNumunder {
    public static void underscore()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.matches("[a-zA-z0-9]+_*"))
        {
            System.out.println("Match Found");
        }
        else
        {
            System.out.println("Match Not Found");
        }
    }

}
