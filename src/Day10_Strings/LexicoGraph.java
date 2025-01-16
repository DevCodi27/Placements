package Day10_Strings;

import java.util.Scanner;

public class LexicoGraph {
    public static void lex()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        System.out.println(str.compareTo(str1));
    }
}
