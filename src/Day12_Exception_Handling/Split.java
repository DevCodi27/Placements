package Day12_Exception_Handling;

import java.util.Scanner;

public class Split {
    public static void splitString() {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        String[] ans = str.split("/");
        int n = ans.length;
        try {
            if (n < 2) {
                throw new NullPointerException("Word is less than 1");
            } else {
                for (int i = 0; i < ans.length; i++) {
                    System.out.println("Splitter string at index " + i + " " + ans[i]);
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("Inside block Executed");
        }
    }
}
