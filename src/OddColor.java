import java.util.ArrayList;
import java.util.HashSet;

public class OddColor
{
    public void colour(char[] color)
    {
        ArrayList<Character> ls =new ArrayList<>();
        int size = color.length;
        int cnt = 1;
        for(int i = 0 ; i<size-1 ; i++)
        {
            for(int j = i+1;j<size;j++)
            {
                if(color[i]==color[j])
                {
                    cnt++;
                }

            }
            if(cnt%2!=0)
            {
                ls.add(color[i]);
                cnt = 0;
            }
            cnt = 0;
        }

        HashSet<Character>hs = new HashSet<>();
        for(char c : ls)
        {
            hs.add(c);
        }
        if(hs.size()!=0)
        {
            System.out.println(hs);
        }
        else {
            System.out.println("All are Even");
        }


    }
}
