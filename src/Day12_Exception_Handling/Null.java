package Day12_Exception_Handling;

import java.util.Scanner;

public class Null {
    public static void empty()
    {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String str = null;
            System.out.println(str.charAt(n));
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }

    }
}
