package Day12_Exception_Handling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelReplace {
    public  static void vr()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p = Pattern.compile("[aieou]");
        Matcher m = p.matcher(str);
        while (m.find())
        {
            str = str.replaceAll(m.group(),"p");
        }
        System.out.println(str);
    }
}
