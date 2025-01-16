package Day12_Exception_Handling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DotCount {
    public static void dc()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern p = Pattern.compile("\\.(\\d+)");
        Matcher m = p.matcher(str);
        int cnt = 0;
        while (m.find())
        {
            System.out.println(m.group().length()-1);
        }

    }
}
