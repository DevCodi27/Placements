package Day15_Online_Class;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Logic {
    public static void logic()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str == null)
        {
            System.out.println(-1);
            return;
        }
        int num = str.charAt(0)-'0';
        int cnt = 0;
        for(int i = 1;i<str.length();i+=2) {
             int n = str.charAt(i+1) - '0';
             char c = str.charAt(i);
             if(c=='A')
             {
                 num &= n;
             }
             else if(c=='B')
             {
                 num |= n;
             }
             else if(c=='C'){
                 num ^= n;
             }

        }
        System.out.println(num);
    }
}
