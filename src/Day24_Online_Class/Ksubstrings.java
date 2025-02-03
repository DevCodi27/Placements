package Day24_Online_Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ksubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        ArrayList<String> ls = new ArrayList<>();
        String str1="";
        for(int i=0;i<=str.length()-k;i++)
        {
            for(int j=i;j<i+k;j++)
            {
                str1+=str.charAt(j);
            }
            ls.add(str1);
            str1="";
        }
        int cnt = 0;
        int max = 0;
        for(String word:ls)
        {
            String str3 = "aeiou";

                cnt =  0;
                for(int i = 0;i<word.length();i++)
                {
                    char c = word.charAt(i);
                    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                    {
                        cnt++;
                    }
                }
                if(max<cnt)
                {
                    max = cnt;
                }


        }
        System.out.println(max);

    }
}
