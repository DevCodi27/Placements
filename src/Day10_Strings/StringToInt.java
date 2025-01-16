package Day10_Strings;

import java.util.Scanner;

public class StringToInt {
    public static void Num()
    {
        try {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(Integer.parseInt(str));
        }
        catch (Exception e)
        {
            System.out.println(0);
        }

    }
}
