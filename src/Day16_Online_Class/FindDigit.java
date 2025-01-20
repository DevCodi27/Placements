package Day16_Online_Class;

public class FindDigit {
    public static void findLast()
    {
        int n = 236717;
        String str = String.valueOf(n);
        int len = str.length();
        int k = 3;
        System.out.println(str.charAt(len-k));
    }
}
