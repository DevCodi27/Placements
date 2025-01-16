package Day12_Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MisMatch {
    public static void mismatch()
    {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(n);
        }
        catch (InputMismatchException e)
        {
            System.out.println(e);
        }

    }
}
