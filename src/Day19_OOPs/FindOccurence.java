package Day19_OOPs;

import java.util.Scanner;

public class FindOccurence {
    public static void occurence()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        int cnt = 0;
        for(char i :str.toCharArray())
        {
            if(i==c)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
