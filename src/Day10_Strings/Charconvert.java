package Day10_Strings;

import java.util.Scanner;

public class Charconvert {
    public static void convert()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        String str2 = "";
        for (char c : ch)
        {
            str2+=c;
        }

        System.out.println(str2);
    }
}
