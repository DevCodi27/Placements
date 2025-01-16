package Day3;

public class HollowPyramid {
    public void pyramind(int n)
    {
        int k=(n*2)-1;
        int i = 0;
        while (i < n) {
            for (int j = 0; j < k; j++) {
                if ((i == 0) || (i == j) || (j == k - i - 1)) {
                    System.out.print("*");
                } else if ((j < i) || (j >= k - i)) {
                    System.out.print("b");
                } else {
                    System.out.print("i");
                }
            }
            System.out.println();
            i++;
        }

    }
}
