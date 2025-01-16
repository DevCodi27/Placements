package Day15_Online_Class;

import java.util.HashMap;
import java.util.Scanner;

public class FindUinque {
    public static void unique()
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : str.toCharArray())
        {
            hm.put(c, hm.getOrDefault(c,0)+1);
        }
        char ans = 0;
        for (char c: hm.keySet())
        {
            if (hm.get(c)==1)
            {
                ans = c;
            }

        }
        System.out.println(ans);
    }
}
