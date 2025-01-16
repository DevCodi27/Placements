package Day10_Strings;

public class FormatExample {
    public static void format()
    {
        String name = "sonoo";
        String stf1 = String.format("name is %s",name);
        String stf2 = String.format("value is %f",32.33434);
        String stf3 = String.format("value is %32.12f",32.33434);
        System.out.println(stf1);
        System.out.println(stf2);
        System.out.println(stf3);
    }
}
