package Day10_Strings;

import java.util.Scanner;

public class Carnival {
    public static void cookie()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[]str1 = str.split(" ");
        int n = str1.length;
        boolean flag = true;
        for(int i = 0;i<n-1;i++)
        {
            if(str1[i].equals("cookie")&&!(str1[i+1].equals("juice")))
            {
                flag = false;
            }
        }
        if(flag)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
