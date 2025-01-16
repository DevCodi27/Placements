package Day12_Exception_Handling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReVoewl {
    public static void rv()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();;
        Pattern p = Pattern.compile("[^aeiou]");
        Matcher m = p.matcher(str);
        String str1="";
        while (m.find())
        {
            str1+= m.group();
        }
        str = str1;
        System.out.println(str);
    }
}
