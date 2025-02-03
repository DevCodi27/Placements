package Day25_Online_Class;

import java.util.Scanner;

public class StarRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n;
        String str2 ="";
        for(int i = 1;i<str.length();i++)
        {
            if(str.charAt(i)!='*')
            {
                if(str.charAt(i-1)!='*')
                {
                    str2+=str.charAt(i-1);
                }


            }
        }
        if(str.charAt(str.length()-1)!='*')
        {
            str2+=str.charAt(str.length()-1);
        }

        System.out.println(str2);
    }
}
