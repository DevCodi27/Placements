package Day12_Exception_Handling;

import java.util.Scanner;

public class ArrayOutofBound {
    public static void arr()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = sc.nextInt();
        int num = sc.nextInt();
        int div = sc.nextInt();
        int l = sc.nextInt();
        String str = null;
        try {

            int[] arr = new int[n];
            for(int i = 0;i<n;i++)
            {
                arr[i]= i;
            }

            System.out.println(arr[index]);


        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
        {

            System.out.println(arrayIndexOutOfBoundsException);
        }
        try {

            int ans = num/div;
            System.out.println(ans);


        }catch (ArithmeticException e)
        {

            System.out.println(e);
        }
        try {


            System.out.println(str.charAt(l));
        }
        catch (NullPointerException nullPointerException)
        {
            System.out.println(str);
            System.out.println(nullPointerException);
        }



    }
}
