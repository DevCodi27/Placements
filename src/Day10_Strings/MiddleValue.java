package Day10_Strings;

import java.util.Scanner;

public class MiddleValue {
    public static void mid()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        if((len%2) == 0)
        {
            int mid1 = (len/2)-1;
            int mid2 = len/2;
            System.out.println(str.substring(mid1,mid2+1));
        }
        else
        {
            int mid = len/2;
            System.out.println(str.charAt(mid));
        }
    }

}
