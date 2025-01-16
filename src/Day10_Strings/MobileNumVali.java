package Day10_Strings;

import java.util.Scanner;

public class MobileNumVali {
    public static void validate()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length()==13 && str.contains("+91"))
        {
            System.out.println("Number is Valid");
        }
        else
        {
            System.out.println("Number is InValid");
        }
    }
}
