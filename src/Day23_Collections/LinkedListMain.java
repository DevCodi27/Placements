package Day23_Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        LinkedList<String> ls = new LinkedList<>();
        for(int i = 0;i<n;i++)
        {
            ls.add(sc.nextLine());
        }
        int index = sc.nextInt();
        ls.remove(index-1);
        for (String c : ls)
        {
            System.out.println(c);
        }
    }
}
