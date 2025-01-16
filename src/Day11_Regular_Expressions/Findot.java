package Day11_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Findot {
    public static void dot()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern ptn = Pattern.compile("\\.(\\d+)");
        Matcher m = ptn.matcher(str);
        while (m.find())
        {
            System.out.println(m.group(1).length());
        }
    }
}
