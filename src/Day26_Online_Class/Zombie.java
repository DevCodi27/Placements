package Day26_Online_Class;

import java.util.Scanner;

public class Zombie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int sum = 0;
        for(int i:arr)
        {
            sum+=i;
        }
        if(e>sum)
        {
            System.out.printf("Yes");
        }
        else {
            System.out.printf("No");
        }
    }
}
