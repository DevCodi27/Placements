package Day11_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeadingZero {
    public static void remove()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern ptn = Pattern.compile("[^00]");
        Matcher m = ptn.matcher(str);
        while (m.find())
        {
            System.out.print(m.group());
        }
    }
}
