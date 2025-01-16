package Day11_Regular_Expressions;

import java.util.Scanner;

public class Qoccuracence {
    public static void qpre()
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.matches("pq*?"))
        {
            System.out.println("Match Found");
        }
        else {
            System.out.println("Match Not Found");
        }
    }
}
