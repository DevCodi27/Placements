package Day23_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ls = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0;i<n;i++)
        {
            ls.add(sc.nextLine());
        }
        for (String c : ls)
        {
            System.out.println(c);
        }
    }
}
