package Day19_OOPs;

import java.util.Scanner;

public class Countdigit {
    public static void cd()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while (n>0)
        {
            int rem = n%10;
            cnt++;
            n=n/10;
        }
        System.out.println(cnt);
    }
}
