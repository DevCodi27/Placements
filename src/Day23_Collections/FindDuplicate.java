package Day23_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> ls = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            ls.add(sc.nextLine());
        }
        String name = ls.get(0);
        int cnt = 0;
        for(int i = 0;i<n-1;i++)
        {
            cnt = 0;
            for (int j = 0;j<n;j++)
            {
                if(ls.get(i)==ls.get(j))
                {
                    name = ls.get(i);
                    cnt++;
                }
            }

        }

        System.out.println(name);
        System.out.println(cnt+1);
    }
}
