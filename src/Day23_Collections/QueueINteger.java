package Day23_Collections;

import java.util.*;

public class QueueINteger {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        Scanner sc  = new Scanner(System.in);
        for (int i = 0;i<5;i++)
        {
            q.add(sc.nextInt());
        }
        q.pollLast();
        Iterator<Integer> t = q.iterator();
        while (t.hasNext())
        {
            System.out.println(t.next());
        }
    }
}
