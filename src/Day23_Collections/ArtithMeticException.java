package Day23_Collections;

import java.util.Scanner;

public class ArtithMeticException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int ans = num1/num2;
            System.out.println(ans);
        }catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
