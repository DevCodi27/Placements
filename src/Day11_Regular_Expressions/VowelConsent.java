package Day11_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelConsent {
    public static void vcletter()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p = Pattern.compile("[^aeiou]");
        Matcher matcher = p.matcher(str);
        while (matcher.find())
        {
            System.out.print(matcher.group());
        }
        p=Pattern.compile("[aeiou]");
        matcher = p.matcher(str);
        while (matcher.find())
        {
            System.out.print(matcher.group());
        }
    }
}
