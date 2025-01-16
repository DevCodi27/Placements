package Day10_Strings;

import java.util.Scanner;

public class RemoveConsecutove {
    public static void removeconsecutive()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String str2="";
        int n = str.length();
        int cnt=0;
        for(char c :str.toCharArray())
        {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                cnt++;
            }
            else {
                cnt = 0;
            }

            if(cnt<=1)
            {
                str2+=c;
            }
        }
        System.out.println(str2);
    }
}
