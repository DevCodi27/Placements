package Day10_Strings;

import java.util.Scanner;

public class Repeat {
    public static void star()
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans ="";
        for(int i = 0;i<input.length()-1;i++)
        {
            if(input.charAt(i)==input.charAt(i+1))
            {
                ans+=input.charAt(i);
                ans+="*";
            }
            else {
                ans+=input.charAt(i);
            }
        }
        ans+=input.charAt(input.length()-1);
        System.out.println(ans);
    }
}
