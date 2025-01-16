package Day14_Online_Class;

import java.util.Scanner;

public class AddOne {
    public static void addone()
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {9,9,9};
        int sum = 0;
        for(int i = 0;i<arr.length;i++)
        {
            sum = (sum+arr[i])*10;
        }
        sum = sum/10;
        sum+=1;
        String str = String.valueOf(sum);
        arr = new int[str.length()];
        int i = 0;
        for(char c : str.toCharArray())
        {
            String str1="";
            str1+=c;
            arr[i] = Integer.parseInt(str1);
            i++;
        }
        for (int j:arr)
        {
            System.out.print(j+" ");
        }
    }
}
