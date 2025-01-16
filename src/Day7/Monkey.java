package Day7;

import java.util.Scanner;

public class Monkey {
    public static void monkey()
    {
        try{
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            if(a<0||b<0||c<0||d<0||e<0)
            {
                System.out.println("Invalid Input");
            }
            int Bananas = d/b;
            int Peanuts = e/c;
            int total = Bananas+Peanuts;
            int Left = a-Math.min(total,a);
            System.out.println(Left);
        }
        catch (Exception e)
        {
            System.out.println("Invalid input");
        }

    }
}
