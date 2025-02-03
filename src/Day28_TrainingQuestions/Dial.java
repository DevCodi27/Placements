package Day28_TrainingQuestions;

import java.util.HashMap;
import java.util.Scanner;

public class Dial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashMap<String,String[]> hs= new HashMap<>();
        String[] str0 = {" "};
        String[] str1 = {"a","b","c"};
        String[] str2 = {"d","e","f"};
        String[] str3 = {"g","h","i"};
        String[] str4 = {"j","k","l"};
        String[] str5 = {"m","n","o"};
        String[] str6 = {"p","q","r","s"};
        String[] str7 = {"t","u","v"};
        String[] str8 = {"w","x","y","z"};
        hs.put("1",null);
        hs.put("2",str1);
        hs.put("3",str2);
        hs.put("4",str3);
        hs.put("5",str4);
        hs.put("6",str5);
        hs.put("7",str6);
        hs.put("8",str7);
        hs.put("9",str8);
        hs.put("0",str0);
        System.out.println(hs);
    }

}
class DialNum{
    public void fun(HashMap<Integer,String[]> hs)
    {

    }
}
