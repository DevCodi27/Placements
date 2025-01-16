package Day10_Strings;

import java.util.Scanner;

public class SapceRemove {
    public static void space()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        for(char c : str.toCharArray())
        {
            if(c !=' ')
            {
                str1+=c;
            }
        }
        System.out.println(str1);
    }
}
