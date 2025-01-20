package Day19_OOPs;

import java.util.Scanner;

public class StudentScore {
    public static void score()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fmax = 0;
        int fr = 0;
        int[][] arr = new int[n][4];
        for (int i = 0;i<n;i++)
        {
            for(int j = 0;j<4;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<n;i++)
        {

            int sum = 0;
            for(int j = 1;j<4;j++)
            {
                sum+=arr[i][j];
            }
            if(fmax<sum)
            {
                fmax = sum;
                fr = arr[i][0];
            }
            System.out.println(sum);
        }

        for(int i=1;i<4;i++)
        {
            int max = 0;
            int index = 0;
            for(int j = 0;j<n;j++)
            {
                if(max<arr[j][i])
                {
                    max = arr[j][i];
                    index = arr[j][0];
                }
            }
            System.out.println(index+" "+max);
        }
        System.out.println(fr+" "+fmax);
    }
}
