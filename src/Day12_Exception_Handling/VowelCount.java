package Day12_Exception_Handling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelCount {
    public static void vc()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m =p.matcher(str);
        int cnt = 0;
        while (m.find())
        {
            cnt++;
        }
        System.out.println(cnt);
    }
}
