package Day23_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String>ls = new ArrayList<>();
        for(int i = 0;i<n;i++)
        {
            ls.add(sc.nextLine());
        }
        String[] arr = new String[ls.size()];
        ls.toArray(arr);
        for(String i:arr)
        {
            System.out.println(i);
        }
    }
}
