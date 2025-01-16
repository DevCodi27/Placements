package Day12_Exception_Handling;

import java.util.Scanner;

public class NFE {
    public static void nfe()
    {
        try {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            float n = Float.parseFloat(str1);
            float n2 = Float.parseFloat(str2);
            System.out.print(str+" "+n+" "+n2);

            throw new java.lang.NumberFormatException();
        }
        catch (java.lang.NumberFormatException e)
        {
            System.out.println(e);
        }

    }
}
