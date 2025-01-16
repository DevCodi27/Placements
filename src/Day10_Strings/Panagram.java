package Day10_Strings;

import java.util.Scanner;

public class Panagram {
    public  static  void allalpha()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int flag = 0;
        if(str.length()<26)
        {
            System.out.println("No");
        }
        else {
            for(int j = 0;j<str.length();j++)
            {
                flag = 0;
                for (char i='a';i<='z';i++)
                {
                    if(str.charAt(j)==i)
                    {
                        flag=1;
                    }

                }
                if(flag==0)
                {
                    System.out.println("No");
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println("Yes");
            }
        }

    }

}
