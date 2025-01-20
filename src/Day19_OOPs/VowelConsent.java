package Day19_OOPs;

public class VowelConsent {
    public String vc(char c)
    {
        c=Character.toLowerCase(c);
        if(c == 'a'||c=='e'||c == 'i'||c=='o'||c=='u')
        {
            return "vowel";
        }
        else
        {
            return "consonant";
        }
    }
}
