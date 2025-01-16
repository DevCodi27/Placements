package Day10_Strings;

import java.util.Scanner;

public class Mail {
    public static void validate()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.contains(".com")||str.contains(".in")||str.contains(".org")||str.contains(".net"))
        {
            System.out.println("Valid email address");
        }
        else {
            System.out.println("Invalid Email address");
        }
    }
}
