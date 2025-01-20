package Day16_Online_Class;

import java.util.Scanner;

public class CipherText {
    public static void text()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cp = sc.nextInt();
        if(cp>=str.length())
        {
            System.out.println("Invalid Input");
            return;
        }
        String str1 = "";
        for(int i = 0;i<str.length();i++)
        {
            int n = i+cp;
            if(n>=str.length())
            {
                n=n%str.length();
            }
            str1+=str.charAt(n);
        }
        System.out.println(str1);
    }
}
