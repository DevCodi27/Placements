package Day26_Online_Class;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstLongestSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        ArrayList<Integer> cs = new ArrayList<>();
        ArrayList<Integer>ls = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            if(cs.isEmpty()||cs.get(cs.size()-1)<=arr[i])
            {
                cs.add(arr[i]);
            }
            else {
                if(cs.size()> ls.size())
                {
                    ls = new ArrayList<>(cs);
                    cs.clear();
                    cs.add(arr[i]);
                }
            }
        }
        if(cs.size()> ls.size())
        {
            ls = new ArrayList<>(cs);
        }
        System.out.println(ls);
    }
}
