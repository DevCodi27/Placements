package Day10_Strings;

import java.util.Scanner;

public class Find {
    public static void find()
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(str1.contains(str2))
        {
            System.out.println("String is found in the sentence");
        }
        else {
            System.out.println("String is not found in the sentence");
        }

    }
}
