package Day11_Regular_Expressions;

import java.util.Scanner;

public class CamelCase {
    public static void camelcase()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.matches("[A-Z]+?[a-z]+"))
        {
            System.out.println("Match Found");
        }
        else {
            System.out.println("Match Not Found");
        }
    }
}
