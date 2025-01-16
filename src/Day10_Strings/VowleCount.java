package Day10_Strings;

import java.util.Scanner;

public class VowleCount {
    public static void vowels()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int n = str.length();
        int i = 0;
        int cnt = 0;
        while(i<n)
        {
            char c = str.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                cnt++;
            }
            i++;
        }
        System.out.println(cnt);
    }


}
