package Day13_Online_Class;

import java.util.Scanner;

public class IndexOutofBound {
    public static void str()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int index = sc.nextInt();
        try {
            System.out.println(str.charAt(index));
        }catch (StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
