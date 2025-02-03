package Day23_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String>ls = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0;i<n;i++)
        {
            ls.add(sc.nextLine());
        }
        System.out.println(ls);
        for (int i = 0;i<n;i++)
        {
            System.out.println("Element at the index "+i+" "+ls.get(i));
        }
        System.out.println("Last element in the list: "+ls.get(n-1));
    }
}
