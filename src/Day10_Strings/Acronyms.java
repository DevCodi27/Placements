package Day10_Strings;

import java.util.Scanner;

public class Acronyms {
    public static void shotform()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(" ");
        String ans="";
        for(String word : s)
        {
            ans+=word.charAt(0);
        }
        System.out.println(ans);
    }
}
