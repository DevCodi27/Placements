package Day24_Online_Class;

import java.util.Scanner;

public class Triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag =false;
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        for(int i = 0;i<n-2;i++)
        {
           if(arr[i]<arr[i+1]&&arr[i+1]<arr[i+2])
           {
               flag = true;
           }
        }
        System.out.println(flag);
    }
}
