package Day11_Regular_Expressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GPattern {
    public static void validateg()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern ptn = Pattern.compile("\\Bg\\B");
        Matcher matcher = ptn.matcher(str);
        if(matcher.find())
        {
            System.out.println("Match Found");
        }
        else
        {
            System.out.println("Match not found");
        }
    }
}
