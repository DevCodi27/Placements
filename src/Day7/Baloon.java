package Day7;

import java.util.HashMap;

public class Baloon {
    public void count(char[] arr)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:arr)
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        boolean flag = true;
        for(char c: map.keySet())
        {
            if(map.get(c)%2!=0)
            {
                System.out.println(c);
                flag = false;
            }
        }
        if(flag)
        {
            System.out.println("All are Even");
        }
    }
}
