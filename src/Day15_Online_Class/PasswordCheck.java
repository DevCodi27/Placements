package Day15_Online_Class;

import java.util.Scanner;

public class PasswordCheck {
    public static void password()
    {
        Scanner sc = new Scanner(System.in);
        String pw = sc.nextLine();
        if(pw.length()<4)
        {
            System.out.println(0);
            return;
        }
        if(pw.matches("^[^\\\\d\\\\s/][^\\\\s/]*$"))
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }
    }
}
