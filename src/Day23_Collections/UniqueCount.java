package Day23_Collections;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueCount {
    public static void main(String[] args) {
        HashSet<String>hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            hs.add(sc.nextLine());
        }
        System.out.println(hs.size());
    }
}
