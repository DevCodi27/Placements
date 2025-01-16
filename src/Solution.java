import java.util.*;
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        boolean ans = false;
        int n = deck.length;
        Arrays.sort(deck);
        ArrayList<Integer>ls = new ArrayList<>();
        int cnt = 0;
        for(int i = 1;i<n;i++)
        {
            if(deck[i-1]==deck[i])
            {
                cnt++;
            }
            else
            {
                ls.add(cnt);
                cnt = 0;
            }
        }

        int lsn = 0;
        System.out.println(ls);
        for(int i = 1;i<ls.size();i++)
        {
            if(ls.get(i-1)==ls.get(i))
            {
                lsn++;
            }

        }
        if(lsn == (ls.size()-1))
        {
            ans = true;
        }
        return ans;
    }
}