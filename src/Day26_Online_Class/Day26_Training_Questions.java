package Day26_Online_Class;

import java.util.Scanner;

public class Day26_Training_Questions {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        sol.pyramid();
    }
}

class Solution1{
    public void pyramid()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int sum = 6;
        int res;
        for(int i = 0;i<n;i++)
        {
            for(int j = n;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j = 0;j<i+1;j++ )
            {
                ans += sum;
                res = ans;
                sum+=16;
                System.out.printf("%05d %s",res," ");
            }

            System.out.println();
        }
    }
}
