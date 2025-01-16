package Day6;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BinaryNumber {
    public void binary(int n)
    {
        int[] binary = new int[35];
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while(n>0)
        {
            arrayList.add(n%2);
            n=n/2;
        }
        Collections.reverse(arrayList);
        int max = 0;
        int cnt=0;
        for(int j:arrayList)
        {
            if(j==0)
            {
                cnt++;
            }
            else
            {
                cnt=0;
            }
            max=Math.max(max,cnt);
        }
        System.out.println(max);
    }
}
