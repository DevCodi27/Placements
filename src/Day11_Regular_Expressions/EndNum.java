package Day11_Regular_Expressions;

import java.util.Scanner;

public class EndNum {
    public static void num()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.matches("[a-zA-Z]+[0-9]+"))
        {
            System.out.println("Match Found");
        }
        else
        {
            System.out.println("Match Not Found");
        }
    }
}
